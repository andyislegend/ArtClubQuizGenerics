# ArtClubQuizGenerics
ArtBrains ArtClub Topic on Generics in Java Puzzlers

## Answer to Pazzlers with explanations

1. Clone.java
  * Well, a quite easy puzzler. Despite we ensure compiler that generic < T > extends Clonable, we still get compilation error - *'clone() has protected access in java.lang.Object'*
2. Compressor.java
  * For the first time everything looks OK. But, after a closer look you notice that we create instance of class Compressor without any generic parametrization. Even if don't use it anywhere in code thus will brack everything up due to type erasure. We will no longer have 2 generalized overload methods, but methods with raw types. And when runtime will get this code, he will try to use the narrowest method he could - *int compress(List list)* and will throw ClassCastException in there: we really cann't cast String to int :(
3. ConcreateList.java
