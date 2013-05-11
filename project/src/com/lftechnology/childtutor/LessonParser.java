package com.lftechnology.childtutor;

import java.io.IOException;
import java.io.InputStream;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public class LessonParser {

    public static Lesson parse(InputStream is) throws XmlPullParserException, IOException {
        Lesson lesson = null;
        int current = -1;
        XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
        factory.setNamespaceAware(false);
        XmlPullParser xpp = factory.newPullParser();

        xpp.setInput(is, null);

        int eventType = xpp.getEventType();
        while (eventType != XmlPullParser.END_DOCUMENT) {
            if (eventType == XmlPullParser.START_DOCUMENT) {
                System.out.println("Start document");
                lesson = new Lesson();
            } else if (eventType == XmlPullParser.END_DOCUMENT) {
                System.out.println("End document");
            } else if (eventType == XmlPullParser.START_TAG) {

                String tag = xpp.getName();
                if (tag.equals("page")) {
                    lesson.pages.add(++current, new Lesson.Page());
                } else if (tag.equals("image")) {
                    lesson.pages.get(current).image = xpp.getAttributeValue(null, "path");
                } else if (tag.equals("sound")) {
                    lesson.pages.get(current).image = xpp.getAttributeValue(null, "path");
                }

                // current = handleTag(lesson, current, xpp.getName(),
                // xpp.getAttributeValue(null, "path"));
                System.out.println("Start tag " + xpp.getName());
            } else if (eventType == XmlPullParser.END_TAG) {
                System.out.println("End tag " + xpp.getName());
            } else if (eventType == XmlPullParser.TEXT) {
                System.out.println("Text " + xpp.getText());
            }
            eventType = xpp.next();
        }
        // XmlPullParser
        return null;

    }

    private static int handleTag(Lesson lesson, int current, String tag, String path) {

        if (tag.equals("page")) {
            lesson.pages.add(++current, new Lesson.Page());
        } else if (tag.equals("image")) {
            lesson.pages.get(current).image = path;
        } else if (tag.equals("sound")) {
            lesson.pages.get(current).image = path;
        }

        return current;
    }
}
