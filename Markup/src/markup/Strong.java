package markup;

import java.util.List;

public class Strong extends AbstractElement {

    public Strong(List<MarkdownElement> elements) {
        super("__", "<strong>", "\\textbf{", elements);
    }

}
