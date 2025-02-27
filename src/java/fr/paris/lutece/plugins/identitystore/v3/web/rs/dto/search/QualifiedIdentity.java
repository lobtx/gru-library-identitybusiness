/*
 * Copyright (c) 2002-2023, City of Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.search;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder( {
        "scoring", "quality", "coverage", "connection_id", "customer_id", "attributes"
} )
public class QualifiedIdentity
{

    /**
     * Niveau de qualité de l'identité
     */
    protected Integer quality;

    /**
     * Couverture des exigences du contract de service
     */
    protected Integer coverage;

    /**
     * Score
     */
    protected Integer scoring;

    /**
     * GUID
     */
    @JsonProperty( "connection_id" )
    protected String connectionId;

    /**
     * CUID
     */
    @JsonProperty( "customer_id" )
    protected String customerId;

    /**
     * Attributs
     */
    protected List<CertifiedAttribute> attributes = new ArrayList<>( );

    @JsonIgnore
    protected boolean merged;

    public Integer getQuality( )
    {
        return quality;
    }

    public void setQuality( Integer quality )
    {
        this.quality = quality;
    }

    public Integer getCoverage( )
    {
        return coverage;
    }

    public void setCoverage( Integer coverage )
    {
        this.coverage = coverage;
    }

    public Integer getScoring( )
    {
        return scoring;
    }

    public void setScoring( Integer scoring )
    {
        this.scoring = scoring;
    }

    public List<CertifiedAttribute> getAttributes( )
    {
        return attributes;
    }

    public void setAttributes( List<CertifiedAttribute> attributes )
    {
        this.attributes = attributes;
    }

    public String getConnectionId( )
    {
        return connectionId;
    }

    public void setConnectionId( String connectionId )
    {
        this.connectionId = connectionId;
    }

    public String getCustomerId( )
    {
        return customerId;
    }

    public void setCustomerId( String customerId )
    {
        this.customerId = customerId;
    }

    public boolean isMerged( )
    {
        return merged;
    }

    public void setMerged( boolean merged )
    {
        this.merged = merged;
    }
}
