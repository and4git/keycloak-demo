package com.ebt.common;

/**
 * Интерфейс объектов видео.
 *
 * @author EastBanc Technologies (http://eastbanctech.ru/)
 */
public interface Video {

    String getSource();

    String getId();

    String getTitle();

    String getUrl();

    Double getRating();

    VideoCategory getCategory();

}
