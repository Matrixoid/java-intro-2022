package markup;

import java.util.List;

public abstract class AbstractElement implements MarkdownElement {
    private final String highlighterBase;
    private final String highlighterHtml;
    private final String highlighterTex;
    protected final List<MarkdownElement> elements;

    protected AbstractElement(String highlighterBase, String highlighterHtml, String highlighterTex, List<MarkdownElement> elements) {
        this.highlighterBase = highlighterBase;
        this.highlighterHtml = highlighterHtml;
        this.highlighterTex = highlighterTex;
        this.elements = elements;
    }

    @Override
    public void toMarkdown(StringBuilder sb) {
        sb.append(highlighterBase);
        for (MarkdownElement elem : elements) {
            elem.toMarkdown(sb);
        }
        sb.append(highlighterBase);
    }

    @Override
    public void toHtml(StringBuilder sb) {
        sb.append(highlighterHtml);
        for (MarkdownElement elem : elements) {
            elem.toHtml(sb);
        }
        sb.append(highlighterHtml.charAt(0));
        sb.append("/");
        sb.append(highlighterHtml.substring(1));
    }

    @Override
    public void toTex(StringBuilder sb) {
        sb.append(highlighterTex);
        for (MarkdownElement elem : elements) {
            elem.toTex(sb);
        }
        sb.append("}");
    }

}
