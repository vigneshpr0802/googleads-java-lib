
package com.google.api.ads.adwords.jaxws.v201402.cm;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Use this service to manage location ad extensions. Other types of
 *       <a href="//support.google.com/adwords/answer/3465883">ad extensions</a>
 *       (sitelinks, call extensions, etc.) have been subsumed by
 *       <a href="/adwords/api/docs/guides/feed-services">feeds</a>.
 *       
 *       <p class="note"><b>Note:</b> An ad extension can be associated with
 *       only one campaign.</p>
 *       
 *       <p>Available ad extension types are shown as derived AdExtensions types in
 *       the {@link CampaignAdExtension#adExtension CampaignAdExtension.adExtension}
 *       documentation.</p>
 *       
 *       <p>To override campaign ad extensions on a per-ad basis, use
 *       {@link AdExtensionOverrideService}.</p>
 *       <span class="constraint AdxEnabled">This is disabled for AdX.</span>
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CampaignAdExtensionServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CampaignAdExtensionServiceInterface {


    /**
     * 
     *         Returns a list of {@link CampaignAdExtension}s.
     *         
     *         @param serviceSelector The selector specifying the {@link CampaignAdExtension}s to return.
     *         @return The page containing the {@link CampaignAdExtension}s which meet the
     *         criteria specified by the selector.
     *         @throws ApiException when there is at least one error with the request.
     *       
     * 
     * @param serviceSelector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201402.cm.CampaignAdExtensionPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.cm.CampaignAdExtensionServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.cm.CampaignAdExtensionServiceInterfacegetResponse")
    public CampaignAdExtensionPage get(
        @WebParam(name = "serviceSelector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
        Selector serviceSelector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Applies the list of mutate operations.
     *         @param operations The operations to apply. The same {@link CampaignAdExtension}
     *         cannot be specified in more than one operation.
     *         @return The changed {@link CampaignAdExtension}s.
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201402.cm.CampaignAdExtensionReturnValue
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.cm.CampaignAdExtensionServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.cm.CampaignAdExtensionServiceInterfacemutateResponse")
    public CampaignAdExtensionReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
        List<CampaignAdExtensionOperation> operations)
        throws ApiException_Exception
    ;

}
