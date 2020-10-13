package org.carlspring.strongbox.config.util;

import javax.servlet.MultipartConfigElement;

public class UpdatableMultipartConfigElement extends MultipartConfigElement
{

    private volatile long maxFileSize = -1;

    public UpdatableMultipartConfigElement(final String location,
                                           final long maxFileSize,
                                           final long maxRequestSize,
                                           final int fileSizeThreshold)
    {
        super(location, maxFileSize, maxRequestSize, fileSizeThreshold);
    }

    @Override
    public long getMaxFileSize()
    {
        return maxFileSize == -1 ? super.getMaxFileSize() : maxFileSize;
    }

    public void setMaxFileSize(long maxFileSize)
    {
        this.maxFileSize = maxFileSize;
    }
}
