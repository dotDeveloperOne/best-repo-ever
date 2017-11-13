 Update_Total_Trainings (after insert) {

    
    documentRevisionList = [SELECT ID,Total_Trainings__c FROM CompSuite__Document_Revision__c];
    for(CompSuite__Document_Revision__c rev: documentRevisionList){
        mapDocumentRevisionToId.put(rev.ID, rev);
    }
    
    requirementRevisionList = [SELECT ID,CompSuite__Document_Revision__c FROM CompSuite__Requirement_Revision__c];
    for(CompSuite__Requirement_Revision__c req: requirementRevisionList){
        mapRequirementRevisionToId.put(req.Id,req);
    }
    

}