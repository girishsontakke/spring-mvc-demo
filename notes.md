# Important Annotations
- @Controller - declaring the class as controller ( an extension of Component Annotation)
- @RequestMapping - takes the url to register with the given method.
- @RequestParam - (DI of variable). assign the value coming from form data to the given local variable.
- @ModelAttribute - do parameter DI - takes the name of model coming from incoming request. 

# Form Tags
- form:input
- form:radiobutton
- form:select
- form:options
- form:checkboxes
// path attribute to associate form field with model attribute.

# Validation
- required - @NotNull
- validate length - @Size
- validate range - @Min, @Max
- validate with Regex - @Pattern
- custom validation