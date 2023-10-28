package Homework16;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.Attributes;

class SAXHandler extends DefaultHandler {
    private StringBuilder output = new StringBuilder();
    private StringBuilder content = new StringBuilder();
    private String firstName, lastName, title;
    private boolean isLine = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        content.setLength(0);
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        if (qName.equalsIgnoreCase("firstName"))
            firstName = content.toString();
        else if (qName.equalsIgnoreCase("lastName"))
            lastName = content.toString();
        else if (qName.equalsIgnoreCase("title"))
            title = content.toString();
        else if (qName.equalsIgnoreCase("line"))
            output.append(content.toString().trim()).append('\n');

        isLine = false;
    }

    @Override
    public void characters(char[] ch, int start, int length) {
        content.append(ch, start, length);
    }

    public String getOutput() {
        return output.toString();
    }

    public String getFilename() {
        return firstName + "_"+ lastName + "_" + title;
    }
}