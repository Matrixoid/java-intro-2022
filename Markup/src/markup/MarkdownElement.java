package markup;

public interface MarkdownElement {
    void toMarkdown(StringBuilder sb);
    void toHtml(StringBuilder sb);
    void toTex(StringBuilder sb);
}
