package com.lftechnology.childtutor.model;

import java.io.IOException;
import java.io.InputStream;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import android.util.Log;

import com.lftechnology.childtutor.model.Lesson.Page;

public class LessonParser {

	public static Lesson parse(InputStream is) throws XmlPullParserException, IOException {
		Lesson lesson = null;
		Page page = null;
		XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
		factory.setNamespaceAware(false);
		XmlPullParser xpp = factory.newPullParser();

		xpp.setInput(is, null);

		int eventType = xpp.getEventType();
		while (eventType != XmlPullParser.END_DOCUMENT) {
			if (eventType == XmlPullParser.START_DOCUMENT) {
				lesson = new Lesson();
			} else if (eventType == XmlPullParser.START_TAG) {

				String tag = xpp.getName();
				if (tag.equals("page")) {
					page = new Lesson.Page();
					lesson.pages.add(page);
				} else if (tag.equals("image")) {
					Log.d("Parser", "This is image path: " + xpp.getAttributeValue(null, "path"));
					page.image = xpp.getAttributeValue(null, "path");
				} else if (tag.equals("sound")) {
					Log.d("Parser", "This is sound path: " + xpp.getAttributeValue(null, "path"));
					page.image = xpp.getAttributeValue(null, "path");
				} else if (tag.equals("lesson")) {
					Log.d("Parser", "This is lesson name: " + xpp.getAttributeValue(null, "name"));
					lesson.name = xpp.getAttributeValue(null, "name");
				}

			}
			eventType = xpp.next();
		}
		return lesson;
	}
}
