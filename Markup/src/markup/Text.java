package markup;

import java.util.List;

public class Text extends AbstractParagraphElement {
    private final String value;

    public Text(String value) {
        super("", "", "", List.of());
        this.value = value;
    }

    @Override
    public void toMarkdown(StringBuilder sb) {
        sb.append(value);
    }

    @Override
    public void toHtml(StringBuilder sb) {
        sb.append(value);
    }

    @Override
    public void toTex(StringBuilder sb) {
        sb.append(value);
    }
}
