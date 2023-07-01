package markup;

import java.util.List;

public class Emphasis extends AbstractElement{

    public Emphasis(List<MarkdownElement> elements) {
        super("*", "<em>", "\\emph{", elements);
    }

}
