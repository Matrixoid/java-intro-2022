package markup;

import java.util.List;

public class Strikeout extends AbstractElement {

    public Strikeout(List<MarkdownElement> elements) {
        super("~", "<s>", "\\textst{", elements);
    }

}
