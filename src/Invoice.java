public class Invoice {

    private Float pricePerSession;
    private Float pricePerQuestion;

    private Robot therapist;
    private Person customer;

    private String address;



    public Invoice(Float pricePerSession, Float pricePerQuestion) {
        this.pricePerSession = pricePerSession;
        this.pricePerQuestion = pricePerQuestion;
    }

    public String getInvoice(Integer sessions, Integer questions) {
        Float totalSessionCharge = this.pricePerSession * sessions;
        Float totalQuestionCharge = this.pricePerQuestion * questions;
        Float total = totalQuestionCharge + totalSessionCharge;

        return generateInvoice(
          this.therapist,
          this.customer,
          this.address,
          sessions,
          this.pricePerSession,
          totalSessionCharge,
          questions,
          this.pricePerQuestion,
          totalQuestionCharge,
          total
        );
    }

    private String generateInvoice(Robot therapist, Person customer, String address, Integer sessions, Float pricePerSession, Float totalSessionCharge, Integer questions, Float pricePerQuestion, Float totalQuestionCharge,Float total) {
        StringBuilder s = new StringBuilder();
        s       .append("\n"+therapist + "'s Invoice\n\n")
                .append("To:\n")
                .append(customer+"\n")
                .append(address+"\n\n")
                .append("Items:\n")
                .append(String.format("%8s %-40s %9s %9s\n","Quantity","Description","Price","Total"))
                .append(String.format("%8d %-40s %9.2f %9.2f\n",sessions,"Sessions",pricePerSession,totalSessionCharge))
                .append(String.format("%8d %-40s %9.2f %9.2f\n",questions,"Questions",pricePerQuestion,totalQuestionCharge))
                .append("\n")
                .append(String.format("Total Due: $%-9.2f\n\n",total))
                .append(String.format("Thank you for doing business with %s\n \n",therapist));

        StringBuilder returnValue = new StringBuilder();
        returnValue.append("   +");
        for (int i = 0; i < 78; i++) {
            returnValue.append("-");
        }
        returnValue.append("+\n");
        for (String line : s.toString().split("\n")) {
            returnValue.append(String.format("   | %-76s |    \n",line));
        }
        returnValue.append("   +");
        for (int i = 0; i < 78; i++) {
            returnValue.append("-");
        }
        returnValue.append("+\n");
        return returnValue.toString();
    }


    public Float getPricePerSession() {
        return pricePerSession;
    }

    public Float getPricePerQuestion() {
        return pricePerQuestion;
    }

    public Robot getTherapist() {
        return therapist;
    }

    public void setTherapist(Robot therapist) {
        this.therapist = therapist;
    }

    public Person getCustomer() {
        return customer;
    }

    public void setCustomer(Person customer) {
        this.customer = customer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
