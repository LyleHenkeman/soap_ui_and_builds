FROM edwxie/jdk
MAINTAINER Takealot <qa@takealot.com>

#  Version
ENV   	SOAPUI_VERSION	5.3.0

# Download and unarchive Java
RUN mkdir -p /opt &&\
    curl  http://cdn01.downloads.smartbear.com/soapui/${SOAPUI_VERSION}/SoapUI-${SOAPUI_VERSION}-linux-bin.tar.gz \
    | gunzip -c - | tar -xf - -C /opt && \
    ln -s /opt/SoapUI-${SOAPUI_VERSION} /opt/SoapUI

# Set environment
ENV PATH ${PATH}:/opt/SoapUI/bin
