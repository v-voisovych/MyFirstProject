<%--
  Created by IntelliJ IDEA.
  User: Home
  Date: 18.05.2021
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>

<template:page pageTitle="${pageTitle}">
    <div id="globalMessages">
        <common:globalMessages/>
    </div>

    <cms:pageSlot position="currentNumberOfUsers" var="feature" >
        <cms:component component="${feature}" />
    </cms:pageSlot>
    <cms:pageSlot position="currentNumberOfOrders" var="feature" >
        <cms:component component="${feature}" />
    </cms:pageSlot>

</template:page>