/*
**For you to do:**

Using the following array.

{45, 78, 12,  67, 55, 89, 23, 77, 88}

Create a for loop to extract values from that array so your output looks as below:

```
**Expected Output:**
```

```
78 55 77
```


Note: Find out what is the start point an how much you need to increment to get the result.
 */
package com.syntax.replits.replit4.arrays;

public class E75Arrays {
    public static void main(String[] args) {
        int[] values = {45, 78, 12, 67, 55, 89, 23, 77, 88};
        for (int i = 0; i < values.length; i++) {
            if (values[i] == 78 || values[i] == 55 || values[i] == 77) {
                System.out.print(values[i] + " ");
            }
        }
    }
}
