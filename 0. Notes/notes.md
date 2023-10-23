# Boolean Expressions

While we've covered many actions in programming through operations, as well as objects and their methods, much of it has been focused around the numerical data types like `int` and `double`, or more recently our objects for storing text, `String` objects. We had introduced a third primitive data type in Unit 1 in the form of the `boolean` value, more commonly known as a `true` or `false` value.

---

## Boolean Expressions

Until now, many of our operations have resulted in types similar to the ones that were put in (i.e., adding an `int` and a `double` results in a `double`). **Boolean expressions** change this paradigm by introducing operators that may produce a completely different type for their result than the ones put in, specifically results in the form of the `boolean` type. Well, how can we go from numbers or objects to the `boolean` type? The answer is by comparing them to each other.

We can think of comparisons of two values as answering a question. The simplest question we can ask in programming is "are these two things the same?", which we would typically refer to as equality. In an example, the question "is 10 the same as 11?", we would obviously answer "no", which in programming would be translated as the `boolean` value `false`, so we functionally took a comparison between two numbers `10` and `11` and produced the `boolean` answer `false`. Boolean expressions are ones that always produce a `boolean` as a result, regardless of the types of the inputs.

---

## Relational Operators

When we compare two things, we refer to it as a **relational operation**, meaning the answer to the question is relative to the two values. Our two most basic **relational operators** can compare two primitive values, reference values (note: not objects, their references), or objects themselves in the form of two basic questions:

- "Are these two things equal?"
- "Are these two things not equal?" (can also be rephrased as "Are these two things different?")

When wanting to decide if two things are equal, we unfortunately cannot use an equals sign `=`, since from our earlier work we know that it represents assignment of information. Instead, we use two equals signs `==` to compare two things to see if they are equal. We place the equality operator between two values to determine if they are equivalent. This can be done with any primitive types, reference values (the locations of objects, not the objects themselves), or objects. Here is some examples from the `NotesEqual1.java` file:

```java
System.out.println(10 == 11); // We know this must be `false`
System.out.println(10.5 == 10.5); // We know this must be `true`
System.out.println(true == false); // We know this must be `false`
System.out.println("Hello" == "Hello"); // Since this is comparing two objects, and not references to two objects,
                                        // these are equal and will result in `true`
String var1 = "Hello";
String var2 = var1;
String var3 = new String("Hello");
System.out.println(var1 == var2); // Since `var1` and `var2` are set to share the same memory location, they must be equal.
System.out.println(var1 == var3); // Since `var1` and `var3` are set to different memory locations, they must not be equal.
```

This produces the following output:

```
false
true
false
true
true
false
```

Just like checking if two things are equal, we can also check if they are not equal, often better phrased as if they are different. This operator is made by combining an exclamation point `!` and an equals sign `=` to produce the not equals operator `!=`. We place the not equals operator between two values to determine if they are different. If the two values are different, it produces the `boolean` value `true`, while if they are the same it produces the `boolean` value `false`. This can be done with any primitive types, reference values (the locations of objects, not the objects themselves), or objects. Here is some examples from the `NotesNotEqual1.java` file:

```java
System.out.println(10 != 11); // We know this must be `true`
System.out.println(10.5 != 10.5); // We know this must be `false`
System.out.println(true != false); // We know this must be `true`
System.out.println("Hello" != "Hello"); // Since this is comparing two objects, and not references to two objects,
                                        // these are equal and will result in `false`
String var1 = "Hello";
String var2 = var1;
String var3 = new String("Hello");
System.out.println(var1 != var2); // Since `var1` and `var2` are set to share the same memory location, they must be equal.
System.out.println(var1 != var3); // Since `var1` and `var3` are set to different memory locations, they must not be equal.
```

Note that we used the same values as the last example, but swapped the operators. We expect then, for it to be the opposite because if they were equal, then it was `true`, but with the new operator, being the same would be `false` and vice a versa. This produces the following output:

```
true
false
true
false
false
true
```

We have several more relational operators as well that are used more exclusively for numerical values, and you are already familiar with from your math class:

- Less than `<`
- Greater that `>`
- Less than or equal to `<=`
- Greater than or equal to `>=`

When put between two numerical values, this will determine the result of the left value compared to the right value. As an example, in the statement `5 > 3`, it will check if `5` is greater than `3`, which in this case, is `true`.

Here are some examples from the NotesGreaterLess1.java file:

```java
System.out.println(10 < 4); // 10 is not less than 4, so `false`
System.out.println(3 > 2); // 3 is greater than 2, so `true`
System.out.println(5.1 <= 6); // 5.1 is less than or equal to 6, so `true`
System.out.println(4.0 >= 4.0); // 4.0 is greater than or equal to 4.0, so `true`
```

This produces the following output:

```
false
true
true
true
```

In summary, we have six relational operators to compare things:

1. Equal to `==`
2. Not equal to `!=`
3. Less than `<`
4. Greater that `>`
5. Less than or equal to `<=`
6. Greater than or equal to `>=`

---

## Assignment

Now that you have gone through the notes for this section, you can check out the `Try.md` and `Try.java` files to try a short assignment using this material.
