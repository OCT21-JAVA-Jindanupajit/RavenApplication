Write a program that simulates Raven, aka chat therapist Eliza's emo cousin.

Raven will ask how you your day was much like Eliza, but she will rejoice and share in your dismay, rather than try and comfort you.

Raven should start by asking,
"Good morning, how are you feeling today?"
(or any other emo equivalent)

She should then scan the user's reply for a match on feeling words, which you need to preset when you design Raven. You would neeed to scan for both sets of feeling words.

Feeling words can be stored in an array or arraylist:
String [ ] positive = {"good", "glad", "happy", "relaxed", "accomplished", "alert", "creative"};

String [ ] negative = {"bad", "sad", "tired", "angry", "anxious", "hungry", "moody", "afraid"};

Depending on the number of matches, if there are more positive words then negative ones, Raven will reply as you imagine an emo person may reply,
"I am so happy for you...Yay..."

But if she picks up on your bad day, Raven will be delighted and say something like,
"Really! Why, tell me more!"

If the number of positive and the number negative words cancel each other out, she can simply say,
"Meh."

Give the user the option to continue talking with Raven until they decided they've had enough of Raven, and press "Q" to quit. Then display the chat history once the session is over.
DO this using OOP.
Make Raven your own and get creative!

Once you are finished with Raven, add an Invoice class.

An Invoice shall contain the name, address and contact information of the user, a list of items to charge for as shown below.

All code to generate the invoice must be in the Invoice class. You may only use main to prompt for or display information.

A session costs $100.00 plus 35 cents per question.