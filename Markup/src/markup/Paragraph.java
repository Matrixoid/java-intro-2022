package markup;

import java.util.List;

public class Paragraph extends AbstractElement implements ListElement{

    public Paragraph(List<ParagraphElement> elements) {
        super("", "", "", elements);
    }

    @Override
    public void toHtml(StringBuilder sb) {
        for (MarkdownElement elem : elements) {
            elem.toHtml(sb);
        }
    }

    @Override
    public void toTex(StringBuilder sb) {
        for (MarkdownElement elem : elements) {
            elem.toTex(sb);
        }
    }
}
