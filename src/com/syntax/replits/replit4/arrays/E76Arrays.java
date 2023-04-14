/*
**For you to do:**

Write a program that creates a String array with size 7.

Ask the user to input Days of a week beginning with Sunday using Scanner class.

Add these inputs to your array and then print all values from that array

Example:

Please enter day 1 of the week

Sunday

Please enter day 2 of the week

Monday

Please enter day 3 of the week

Tuesday etc

**Example Output:**

```
Please enter day 1 of the week
```

```
Sunday
```

```
Please enter day 2 of the week
```

```
Monday
```

```
Please enter day 3 of the week
```

```
Tuesday
```

```
Please enter day 4 of the week
```

```
Wednesday
```

```
Please enter day 5 of the week
```

```
Thursday
```

```
Please enter day 6 of the week
```

```
Friday
```

```
Please enter day 7 of the week
```

```
Saturday
```

```
Sunday
```

```
Monday
```

```
Tuesday
```

```
Wednesday
```

```
Thursday
```

```
Friday
```

```
Saturday
```
 */
package com.syntax.replits.replit4.arrays;

import java.util.Scanner;

public class E76Arrays {
    public static void main(String[] args) {
        String[] weekDay = new String[7];
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        for (int i = 0; i < weekDay.length; i++) {
            System.out.println("Please enter day " + number + " of the week");
            number++;
            weekDay[i] = scanner.next();
        }

        for (String day : weekDay) {
            System.out.println(day);
        }
    }
}
