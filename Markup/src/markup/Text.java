package markup;

public class Text implements MarkdownElement {
    private final String value;

    public Text(String value) {
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
