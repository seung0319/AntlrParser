Compiler Parser MP S11
Members: 
Dustin Ampong
SeungHwan Cho
Jan Ren Quiachon

Main Java : ExpressionApp.java in app package

Steps to run
1. Clone or get the zip file.
2. Open in eclipse.
3. Right click on project > build path > configure path > Libraries > Modulespath > edit/remove current JRE file > add library > select your chosen JRE > click apply.
4. In the same window > Classpath > edit/remove current antlr jar file > add external library > go to lib > choose antlr 4.7.2 jar file in “lib” folder of the project > click apply.
5. In the same window > go to Source > expand AntlrParser/src > Click on native library location > click edit button > select workspace > lib folder (where antlr 4.7.2 jar is in) // OR > select external >  Locate antlr library folder(where antlr 4.7.2 jar file is located).
6. Right click on project > Run As > Run Configurations > New java Application > Go to Main tab > click search button for main class > choose “app.ExpressionApp” > click apply.” 
7. In the same window > go to “Arguments” > copy  & paste “${file_prompt}” > click apply
8. When done, click run and pick the test file
9. Check error in the console logs.

*note when selecting a test file, make sure it is in a path folder without a space (example D:\foldername\tests\test1.txt).

*note also make sure the file name does not contain any spaces*
 It reads spaces as delimiter and splits the file into 2.
