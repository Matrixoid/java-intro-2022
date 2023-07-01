package markup;

import java.util.List;

public class Strong extends AbstractParagraphElement {

    public Strong(List<AbstractParagraphElement> elements) {
        super("__", "<strong>", "\\textbf{", elements);
    }

}
