import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.*;

public class CobolToJavaDriver {

    public static void main(String[] args) throws Exception {

        CharStream input = CharStreams.fromFileName("input.cbl");

        CobolFull_fixedLexer lexer = new CobolFull_fixedLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CobolFull_fixedParser parser = new CobolFull_fixedParser(tokens);

        ParseTree tree = parser.program();

        CobolToJavaVisitor visitor = new CobolToJavaVisitor();
        visitor.visit(tree);

        String javaCode = visitor.getJavaCode();

        if (javaCode == null || javaCode.trim().isEmpty()) {
            throw new RuntimeException("Java code generation failed!");
        }

        Files.write(Paths.get("OutputProgram.java"), javaCode.getBytes());

        System.out.println("✅ Java file generated: OutputProgram.java");
    }
}
