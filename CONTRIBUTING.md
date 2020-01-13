# Contributing to `vecmath`

**NB:** This library is procedurally generated, so incorporating any pull requests, containing alterations to the Java source code, takes time until the source generation code is updated to produce equivalent functionality.

Despite that, any pull requests, feature requests and bug reports are highly appreciated. Just keep in mind these simple questions:
* Is the requested or added feature really in scope of this library?
* Is the added code as efficient as it could be? Including:
  * there should be no creation of temporary objects by the library - actually, the library should really not call any constructors explicitly;
  * calling the same accessor method of an input parameter multiple times should be avoided at all cost - cache the result if possible;

---

None of this is set in stone, though. If you can provide some good arguments or have any good solutions, then everything can be changed.

Thank you for your contribution and/or your interest in the library!
