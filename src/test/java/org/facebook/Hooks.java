package org.facebook;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {
@BeforeStep
public void hooksample() {
System.out.println("Hooks Before");
}
@After(order = 2)
public void hooksample2() {
System.out.println("Hooks After");
}
@Before("@Valid")
public void hooksample3() {
System.out.println("Hooks Before2");
}
@After(order = 1)
public void hooksample4() {
System.out.println("Hooks After2");
}
}
