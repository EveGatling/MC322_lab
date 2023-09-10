package library.media;

import library.constants.Media.*;

public class Media {
	// Essential Attributes
	protected int id;
	protected int year;
	protected String title;
	protected String publisher;
	protected String genre;
	protected String summary;
	protected String coverUrl;
	protected MediaType type;

	// Management Attributes
	protected boolean isAvailable;
	protected Domain domain;

	// Additional Attributes
	protected MediaFormat format;
	protected String locationShelf;
	protected String locationBookcase;
	protected PhysicalQuality quality;
	protected int numberCopies;
	protected int availableCopies;

	protected int numberTimesReserved = 0;
	protected int numberTimesLoaned = 0;

	// Constructor
	public Media(String title, String publisher, String genre, String summary, String coverUrl, MediaType type, int year,
			int id) {
		// Essential Attributes
		this.title = title;
		this.publisher = publisher;
		this.year = year;
		this.id = id;
		this.genre = genre;
		this.summary = summary;
		this.coverUrl = coverUrl;
		this.type = type;

		// Default Attributes
		this.isAvailable = false;
		this.domain = Domain.PRIVATE;
		this.numberCopies = 0;
		this.locationBookcase = null;
		this.locationShelf = null;
		this.format = null;
		this.quality = PhysicalQuality.EXCELENT;
		this.availableCopies = 0;
	}

	// Setters and Getters
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return this.publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getGenre() {
		return this.genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getCoverUrl() {
		return this.coverUrl;
	}

	public void setCoverUrl(String coverUrl) {
		this.coverUrl = coverUrl;
	}

	public MediaType getType() {
		return this.type;
	}

	public void setType(MediaType type) {
		this.type = type;
	}

	public boolean getIsAvailable() {
		return this.isAvailable;
	}

	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public Domain getDomain() {
		return this.domain;
	}

	public void setDomain(Domain domain) {
		this.domain = domain;
	}

	public MediaFormat getFormat() {
		return this.format;
	}

	public void setFormat(MediaFormat format) {
		this.format = format;
	}

	public String getLocationShelf() {
		return this.locationShelf;
	}

	public void setLocationShelf(String locationShelf) {
		this.locationShelf = locationShelf;
	}

	public String getLocationBookcase() {
		return this.locationBookcase;
	}

	public void setLocationBookcase(String locationBookcase) {
		this.locationBookcase = locationBookcase;
	}

	public PhysicalQuality getQuality() {
		return this.quality;
	}

	public void setQuality(PhysicalQuality quality) {
		this.quality = quality;
	}

	public int getNumberCopies() {
		return this.numberCopies;
	}

	public void setNumberCopies(int numberCopies) {
		this.numberCopies = numberCopies;
	}

	public int getAvailableCopies() {
		return this.availableCopies;
	}

	public void decreaseAvailableCopies() {
		if (this.availableCopies > 0) {
			this.availableCopies -= 1;
		}

		if (this.availableCopies == 0) {
			this.isAvailable = false;
		}
	}

	public void increaseAvailableCopies() {
		this.availableCopies += 1;

		if (this.availableCopies > 0) {
			this.isAvailable = true;
		}
	}

	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
		this.isAvailable = availableCopies > 0;
	}

	public void increaseTimesReserved() {
		this.numberTimesReserved += 1;
	}

	public void increaseTimesLoaned() {
		this.numberTimesLoaned += 1;
	}

	public int getTimesReserved() {
		return this.numberTimesReserved;
	}

	public int getTimesLoaned() {
		return this.numberTimesLoaned;
	}
}
