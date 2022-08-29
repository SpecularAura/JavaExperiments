## Format Specifier for boolean
Java has a format specifier for boolean to use with printf

## Difference between Signed Right Shift and Unsigned Right Shift
- In signed right shift operator, while shifting, the sign bit (Right most bit/Most Significant Bit) is replaced by the sign bit (0 for positive integers and 1 for negative integers)
<br>
- In unsigned right shift operator, while shifting, the sign bit is replaced by 0s
for e.g.
```Java
int num = -1 ;
System.out.println(Integer.toBinaryString(num)+" " +Integer.toBinaryString(num));
System.out.println(Integer.toBinaryString((num >> 1))+" " +Integer.toBinaryString((num >>> 1)));
```

will output:
```
11111111111111111111111111111111 11111111111111111111111111111111
11111111111111111111111111111111 1111111111111111111111111111111
```
and 
```Java
int num = -1 ;
System.out.println(Integer.toBinaryString(num)+" " +Integer.toBinaryString(num));
System.out.println(Integer.toBinaryString((num >> 2))+" " +Integer.toBinaryString((num >>> 2)));
```

will output: 
```
11111111111111111111111111111111 11111111111111111111111111111111
11111111111111111111111111111111 111111111111111111111111111111
```

**Unssigned Right Shift and Signed Right Shift produce the same output for positive integers**
