/* Constants.java */ 
 class Constants { 
 static final String FOO = "FOO"; 
}

/* FooConstants.java */ 
 class FooConstants {}

/* Example.java */ 
 class Example { 
public method example(String foo) { 
switch (foo) { 
case Constants.FOO: ... 
} 
} 
}