/*
**For you to do:**

Create an array of integers that will store 5 elements taken from a user

Don't print any prompt message for the user

Then print out all the elements you have created in the first loop in reverse order.

**Example:**

```
Input:
```

```
1
```

```
2
```

```
3
```

```
4
```

```
5
```

```
Output:
```

```
5
```

```
4
```

```
3
```

```
2
```

```
1
```
 */
package com.syntax.replits.replit4.arrays;

import java.util.Scanner;

public class E77Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
