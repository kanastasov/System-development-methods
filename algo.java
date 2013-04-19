if(SystemRequirementsCollected)
{	
	if(!demoAppIsReady)
	{	
		while(currentSprint == NSpirnt)
		{
			SoftwareDevelopers.doSprints();
			++NSprint;
		}		
	}	
}



if(SystemRequirementsCollected)
{	
	SystemAnalysis.documentRequirements();
	if(documentedRequirementsNeedsModification)
	{	
		(ScrumMaster || SystemAnalysis).modifyRequirements();
	}	
}


The System Analysis meets with the user and documents the requirements. If the user does not like the documented requirements the system analysis modifies it with the help of a scrum master.
IF user doesn’t  like the documentation
(System analysis && scrum master) modify the requirements for the user needs.
ELSE go with the initial documentation
END IF 

if(userLogIn)
{
	if(userChangeProfile)
	{
		if(userCommitChanges)
		{
			User.changeProfile();
		}
	}
}


if(UsernameIsCorrect && PasswordIsCorrect)
{
	User.allowAccess();
}

If the user attempts to log in using a username and password, read from the user data store to cross reference the username and password to see if it’s correct. If they are both correct allow the user in the system. If they are incorrect, deny access to the user and ask them to try again. The results are then added to the Log in audit data store. 
IF user logs in correctly 
THEN grant access 
ELSE deny access 
END IF 


if(userHasAppliedForMembership && userHasConfirmedHisEmail)
{
	User.Register();
}

If the user attempts to log in using a username and password, read from the user data store to cross reference the username and password to see if it’s correct. If they are both correct allow the user in the system. If they are incorrect, deny access to the user and ask them to try again. The results are then added to the Log in audit data store. 
IF user logs in correctly 
THEN grant access 
ELSE deny access 
END IF 



if(unregisteredUser.interactWithRestrictedPartOfTheSystem)
{
	User.sendRegistrationForm();
	if(userAcceptRegistrationFrom)
	{
		User.procceedWithRegistration();
	}
	else
	{
		User.BlockAccessToRestrictedInformation();
	}
}

If the unregistered user interacts with a restricted part of the system, (THEN) send a registration request to the user. If the user responds to the registration request and registers, (THEN) create a new user from the unregistered user’s registration details. This information is then added to the User data store (1) 
IF unregistered user interacts 
THEN send registration request 
END IF 
IF unregistered user registers 
THEN create user 
ELSE Do nothing and reject registration 


if(finalAppIsReady)
{
	QA.doFullSetOfTests();
	if(!doFullSetOfTests() || clientWantChange)
	{
		SoftwareDevelopers.correctApp();
	}
}


