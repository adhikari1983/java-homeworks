/*
Write a program to print out the pattern:
```
$$$$
```

```
$  $
```

```
$  $
```

```
$$$$
```
 */
package com.syntax.replits.replit3.forloops;

public class E68NestedForLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 || i == 3 || j == 0 || j == 3) {
                    System.out.print("$");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
