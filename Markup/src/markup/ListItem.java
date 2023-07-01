package markup;

import java.util.List;

public class ListItem extends AbstractElement{
    private final String highlighterTex;

    public ListItem(List<ListElement> elements) {
        super("!!!", "<li>", "\\item", elements);
        highlighterTex = "\\item";
    }

    @Override
    public void toMarkdown(StringBuilder sb) {
        throw new UnsupportedOperationException("Markdown для ListItem не определён");
    }

    @Override
    public void toHtml(StringBuilder sb) {
        sb.append("<li>");
        for (MarkdownElement elem : elements) {
            elem.toHtml(sb);
        }
        sb.append("</li>");
    }

    @Override
    public void toTex(StringBuilder sb) {
        sb.append(highlighterTex);
        sb.append(" ");
        for (MarkdownElement elem : elements) {
            elem.toTex(sb);
        }
    }
}
