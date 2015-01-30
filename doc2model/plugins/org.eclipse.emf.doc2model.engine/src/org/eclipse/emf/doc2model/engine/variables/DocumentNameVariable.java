head	1.1;
access;
symbols;
locks; strict;
comment	@# @;


1.1
date	2010.03.02.22.34.53;	author tfaure;	state Exp;
branches;
next	;
commitid	7a6d4b8d92874567;


desc
@@


1.1
log
@doc2model engine first commit
it understands a part of the action language and run a transformation from documents to models
@
text
@/**
 * Copyright (c) 2010 ATOS ORIGIN INTEGRATION.
 * 
 *     
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Tristan FAURE (ATOS ORIGIN INTEGRATION) tristan.faure@@atosorigin.com - Initial API and implementation
 */
package org.eclipse.emf.doc2model.engine.variables;

import org.eclipse.emf.doc2model.documents.constants.PropertyConstants;
import org.eclipse.emf.doc2model.engine.contracts.VariableResolver;
import org.eclipse.emf.doc2model.engine.services.Doc2ModelEngineServices;

public class DocumentNameVariable implements VariableResolver {

	public String getValue(Doc2ModelEngineServices service) {
		return (String) service.get(PropertyConstants.DOCUMENT_NAME);
	}

}
@