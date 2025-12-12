public class CobolToJavaVisitor extends CobolFull_fixedBaseVisitor<String> {

    private StringBuilder sb = new StringBuilder();

    @Override
    public String visitProgram(CobolFull_fixedParser.ProgramContext ctx) {

        sb.append("public class OutputProgram {\n");
        sb.append("    public static void main(String[] args) {\n");

        return visitChildren(ctx);
    }

    @Override
    public String visitDisplayStmt(CobolFull_fixedParser.DisplayStmtContext ctx) {
        String text = ctx.STRING().getText();
        sb.append("        System.out.println(" + text + ");\n");
        return null;
    }

    @Override
    public String visitAddStmt(CobolFull_fixedParser.AddStmtContext ctx) {
        String a = ctx.IDENTIFIER(0).getText();
        String b = ctx.IDENTIFIER(1).getText();
        sb.append("        " + b + " = " + b + " + " + a + ";\n");
        return null;
    }

    @Override
    public String visitStopStmt(CobolFull_fixedParser.StopStmtContext ctx) {
        sb.append("        return;\n");
        sb.append("    }\n");
        sb.append("}\n");
        return null;
    }

    public String getJavaCode() {
        return sb.toString();
    }
}
