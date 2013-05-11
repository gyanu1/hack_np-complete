package com.lftechnology.childtutor.model;

import java.util.ArrayList;
import java.util.List;

public class Lesson {

	private int currentPage;

	public static class Page {
		public String image;
		public String sound;
	}

	protected List<Page> pages;

	public Page getFirstPage() {
		currentPage = 0;
		return pages.get(0);
	}

	public Page getNextPage() {
		if (isLastPage())
			return null;
		return pages.get(++currentPage);
	}

	public Page getPrevPage() {
		if (isFirstPage())
			return null;
		return pages.get(--currentPage);
	}

	public boolean isLastPage() {
		return currentPage == pages.size() - 1;
	}

	public boolean isFirstPage() {
		return currentPage == 0;
	}

	public Lesson() {
		currentPage = 0;
		pages = new ArrayList<Page>();
	}
}
