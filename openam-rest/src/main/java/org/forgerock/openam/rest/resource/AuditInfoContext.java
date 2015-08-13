/*
 * The contents of this file are subject to the terms of the Common Development and
 * Distribution License (the License). You may not use this file except in compliance with the
 * License.
 *
 * You can obtain a copy of the License at legal/CDDLv1.0.txt. See the License for the
 * specific language governing permission and limitations under the License.
 *
 * When distributing Covered Software, include this CDDL Header Notice in each file and include
 * the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 * Header, with the fields enclosed by brackets [] replaced by your own identifying
 * information: "Portions copyright [year] [name of copyright owner]".
 *
 * Copyright 2015 ForgeRock AS.
 */
package org.forgerock.openam.rest.resource;

import org.forgerock.http.Context;
import org.forgerock.http.context.ServerContext;
import org.forgerock.openam.audit.AuditConstants.Component;

/**
 * Audit context allows for the component area to be passed through.
 *
 * @since 13.0.0
 */
public final class AuditInfoContext extends ServerContext {

    private static final String CONTEXT_NAME = "AuditContext";

    private final Component component;

    public AuditInfoContext(Context parent, Component component) {
        super(parent);
        this.component = component;
    }

    public Component getComponent() {
        return component;
    }

    @Override
    public String getContextName() {
        return CONTEXT_NAME;
    }

}