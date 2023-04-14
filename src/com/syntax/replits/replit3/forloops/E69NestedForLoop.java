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

public class E69NestedForLoop {
    public static void main(String[] args) {

        for (int i = 7; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
        for (int k = 2; k <= 7; k++) {
            for (int l = 1; l <= k; l++) {
                System.out.print(l + " ");
            }
            System.out.println(" ");
        }
    }
}
