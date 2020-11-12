# Summer Research Project - Integrating purity-checked java code with Wyvern

## Setting up this project

- Clone with `--recursive` - Wyvern is included as a submodule.
- Unzip the checker-framework zip file into a top-level folder with the same name
- Copy checker-framework-x.x.x/checker/dist/checker-qual.jar to wyvern/tools/lib

### Project dependencies
- Wyvern code demos (allowed.wyv, not-allowed.wyv)
    - Java code (PureLib.java, ImpureLib.java)
        - Javac with checker processor
        - checker-qual.jar
    - Wyvern compiler (wyvern-tools)
        - checker-qual.jar

### Setting up Wyvern with IntelliJ

 - Open main (`srp`) folder with IntelliJ
 - File > Project Structure
 - Select or download JDK 11
 - Open Ant window
 - Run default action and "arch-parsers" action to generate the Wyvern parsers.
 - Build and run the project.
