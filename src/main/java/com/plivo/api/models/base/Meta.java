package com.plivo.api.models.base;

public class Meta {

  private Long limit;
  private String next;
  private Long offset;
  private String previous;
  private Long count;

  public Long getLimit() {
    return limit;
  }

  public String getNext() {
    return next;
  }

  public Long getOffset() {
    return offset;
  }

  public String getPrevious() {
    return previous;
  }

  public Long getCount() {
    return count;
  }
}
