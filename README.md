## Make Change Project

### Description

In the cash register we will calculate the amount of change returned to a customer based on the purchase price and the amount tendered. We will also notify the attendant how many of each piece of currency ($20 ,$10 ,$5 ,$1, .25c, .10c, .05c, .01c) is needed to make the change for the customer. Change should be provided using the largest bill and coin denominations as possible. Denominations that are not used should not be displayed.

### Topics and Technologies Used

* Conditionals (if/else)
* Looping (while loops)
* Java 1.8
* Methods

* Experimented with  
  * Recursion in place of loop.  

### How to Run

1. Run the application from Eclipse
2. Enter price of item being purchased
3. Enter how much money was tendered
4. Results should output amount of each currency

### Lessons Learned

* Issue:
I did a very light outline with a couple of methods that I though would be needed, then began coding. This was a mistake as it made me have to jump around more and think in greater detail about where I was and what needed to be done.

  * Improve/Fix:  
  Organize and outline the program completely with examples of input/output and expected results. I should not only include comments about what I'm doing but examples with pseudo code. I thought being that I should just look at the notes and know exactly what to code so that I can spend more time debugging and refactoring.

* Issue:
Trying to figure out how to best fix the inconsistence in rounding with Java on the last penny.

  * Solution:
  I added an if statement that looked for change above .009 and below 0.01 and if that condition was true to add one to the one cent variable.
  code below  

  }else if (countChange >= .01) {
  coin01 = (int)(countChange / .01);
  countChange %= .01;
    if (countChange > 0.009 && countChange < 0.01) {
      coin01++;
  }
  result += " " + coin01 + " penny(ies)";
