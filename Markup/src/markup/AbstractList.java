package markup;

import java.util.List;

public abstract class AbstractList extends AbstractElement implements ListElement {
    String highlighterTex;
    protected AbstractList(String highlighterBase, String highlighterHtml, String highlighterTex, List<ListItem> elements) {
        super(highlighterBase, highlighterHtml, highlighterTex, elements);
        this.highlighterTex = highlighterTex;
    }

    @Override
    public void toTex(StringBuilder sb) {
        sb.append("\\begin{");
        sb.append(highlighterTex);
        sb.append("}");
        for (MarkdownElement elem : elements) {
            elem.toTex(sb);
        }
        sb.append("\\end{");
        sb.append(highlighterTex);
        sb.append("}");
    }
}
