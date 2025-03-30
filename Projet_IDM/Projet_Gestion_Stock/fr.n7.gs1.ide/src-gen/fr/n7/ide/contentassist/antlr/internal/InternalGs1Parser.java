package fr.n7.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.n7.services.Gs1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGs1Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'addition'", "'soustraction'", "'multiplication'", "'division'", "'Application'", "'{'", "'}'", "'Table'", "'id'", "'='", "'Nom'", "'Colonne_derivee'", "'expression'", "'Colonne_referencee'", "'table'", "'colonne'", "'Colonnesimple'", "'ExpressionBinaire'", "'operandeG'", "'operateur'", "'operandeD'", "'AccesVariable'", "'Operateur'", "'type'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGs1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGs1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGs1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalGs1.g"; }


    	private Gs1GrammarAccess grammarAccess;

    	public void setGrammarAccess(Gs1GrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalGs1.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalGs1.g:54:1: ( ruleModel EOF )
            // InternalGs1.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalGs1.g:62:1: ruleModel : ( ( rule__Model__ApplicationsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:66:2: ( ( ( rule__Model__ApplicationsAssignment )* ) )
            // InternalGs1.g:67:2: ( ( rule__Model__ApplicationsAssignment )* )
            {
            // InternalGs1.g:67:2: ( ( rule__Model__ApplicationsAssignment )* )
            // InternalGs1.g:68:3: ( rule__Model__ApplicationsAssignment )*
            {
             before(grammarAccess.getModelAccess().getApplicationsAssignment()); 
            // InternalGs1.g:69:3: ( rule__Model__ApplicationsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGs1.g:69:4: rule__Model__ApplicationsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ApplicationsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getApplicationsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleApplication"
    // InternalGs1.g:78:1: entryRuleApplication : ruleApplication EOF ;
    public final void entryRuleApplication() throws RecognitionException {
        try {
            // InternalGs1.g:79:1: ( ruleApplication EOF )
            // InternalGs1.g:80:1: ruleApplication EOF
            {
             before(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleApplication();

            state._fsp--;

             after(grammarAccess.getApplicationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // InternalGs1.g:87:1: ruleApplication : ( ( rule__Application__Group__0 ) ) ;
    public final void ruleApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:91:2: ( ( ( rule__Application__Group__0 ) ) )
            // InternalGs1.g:92:2: ( ( rule__Application__Group__0 ) )
            {
            // InternalGs1.g:92:2: ( ( rule__Application__Group__0 ) )
            // InternalGs1.g:93:3: ( rule__Application__Group__0 )
            {
             before(grammarAccess.getApplicationAccess().getGroup()); 
            // InternalGs1.g:94:3: ( rule__Application__Group__0 )
            // InternalGs1.g:94:4: rule__Application__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleTable"
    // InternalGs1.g:103:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalGs1.g:104:1: ( ruleTable EOF )
            // InternalGs1.g:105:1: ruleTable EOF
            {
             before(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getTableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalGs1.g:112:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:116:2: ( ( ( rule__Table__Group__0 ) ) )
            // InternalGs1.g:117:2: ( ( rule__Table__Group__0 ) )
            {
            // InternalGs1.g:117:2: ( ( rule__Table__Group__0 ) )
            // InternalGs1.g:118:3: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // InternalGs1.g:119:3: ( rule__Table__Group__0 )
            // InternalGs1.g:119:4: rule__Table__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleColonne"
    // InternalGs1.g:128:1: entryRuleColonne : ruleColonne EOF ;
    public final void entryRuleColonne() throws RecognitionException {
        try {
            // InternalGs1.g:129:1: ( ruleColonne EOF )
            // InternalGs1.g:130:1: ruleColonne EOF
            {
             before(grammarAccess.getColonneRule()); 
            pushFollow(FOLLOW_1);
            ruleColonne();

            state._fsp--;

             after(grammarAccess.getColonneRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColonne"


    // $ANTLR start "ruleColonne"
    // InternalGs1.g:137:1: ruleColonne : ( ( rule__Colonne__Alternatives ) ) ;
    public final void ruleColonne() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:141:2: ( ( ( rule__Colonne__Alternatives ) ) )
            // InternalGs1.g:142:2: ( ( rule__Colonne__Alternatives ) )
            {
            // InternalGs1.g:142:2: ( ( rule__Colonne__Alternatives ) )
            // InternalGs1.g:143:3: ( rule__Colonne__Alternatives )
            {
             before(grammarAccess.getColonneAccess().getAlternatives()); 
            // InternalGs1.g:144:3: ( rule__Colonne__Alternatives )
            // InternalGs1.g:144:4: rule__Colonne__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Colonne__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColonneAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColonne"


    // $ANTLR start "entryRuleColonne_derivee"
    // InternalGs1.g:153:1: entryRuleColonne_derivee : ruleColonne_derivee EOF ;
    public final void entryRuleColonne_derivee() throws RecognitionException {
        try {
            // InternalGs1.g:154:1: ( ruleColonne_derivee EOF )
            // InternalGs1.g:155:1: ruleColonne_derivee EOF
            {
             before(grammarAccess.getColonne_deriveeRule()); 
            pushFollow(FOLLOW_1);
            ruleColonne_derivee();

            state._fsp--;

             after(grammarAccess.getColonne_deriveeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColonne_derivee"


    // $ANTLR start "ruleColonne_derivee"
    // InternalGs1.g:162:1: ruleColonne_derivee : ( ( rule__Colonne_derivee__Group__0 ) ) ;
    public final void ruleColonne_derivee() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:166:2: ( ( ( rule__Colonne_derivee__Group__0 ) ) )
            // InternalGs1.g:167:2: ( ( rule__Colonne_derivee__Group__0 ) )
            {
            // InternalGs1.g:167:2: ( ( rule__Colonne_derivee__Group__0 ) )
            // InternalGs1.g:168:3: ( rule__Colonne_derivee__Group__0 )
            {
             before(grammarAccess.getColonne_deriveeAccess().getGroup()); 
            // InternalGs1.g:169:3: ( rule__Colonne_derivee__Group__0 )
            // InternalGs1.g:169:4: rule__Colonne_derivee__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Colonne_derivee__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColonne_deriveeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColonne_derivee"


    // $ANTLR start "entryRuleColonne_referencee"
    // InternalGs1.g:178:1: entryRuleColonne_referencee : ruleColonne_referencee EOF ;
    public final void entryRuleColonne_referencee() throws RecognitionException {
        try {
            // InternalGs1.g:179:1: ( ruleColonne_referencee EOF )
            // InternalGs1.g:180:1: ruleColonne_referencee EOF
            {
             before(grammarAccess.getColonne_referenceeRule()); 
            pushFollow(FOLLOW_1);
            ruleColonne_referencee();

            state._fsp--;

             after(grammarAccess.getColonne_referenceeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColonne_referencee"


    // $ANTLR start "ruleColonne_referencee"
    // InternalGs1.g:187:1: ruleColonne_referencee : ( ( rule__Colonne_referencee__Group__0 ) ) ;
    public final void ruleColonne_referencee() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:191:2: ( ( ( rule__Colonne_referencee__Group__0 ) ) )
            // InternalGs1.g:192:2: ( ( rule__Colonne_referencee__Group__0 ) )
            {
            // InternalGs1.g:192:2: ( ( rule__Colonne_referencee__Group__0 ) )
            // InternalGs1.g:193:3: ( rule__Colonne_referencee__Group__0 )
            {
             before(grammarAccess.getColonne_referenceeAccess().getGroup()); 
            // InternalGs1.g:194:3: ( rule__Colonne_referencee__Group__0 )
            // InternalGs1.g:194:4: rule__Colonne_referencee__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Colonne_referencee__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColonne_referenceeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColonne_referencee"


    // $ANTLR start "entryRuleColonnesimple"
    // InternalGs1.g:203:1: entryRuleColonnesimple : ruleColonnesimple EOF ;
    public final void entryRuleColonnesimple() throws RecognitionException {
        try {
            // InternalGs1.g:204:1: ( ruleColonnesimple EOF )
            // InternalGs1.g:205:1: ruleColonnesimple EOF
            {
             before(grammarAccess.getColonnesimpleRule()); 
            pushFollow(FOLLOW_1);
            ruleColonnesimple();

            state._fsp--;

             after(grammarAccess.getColonnesimpleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColonnesimple"


    // $ANTLR start "ruleColonnesimple"
    // InternalGs1.g:212:1: ruleColonnesimple : ( ( rule__Colonnesimple__Group__0 ) ) ;
    public final void ruleColonnesimple() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:216:2: ( ( ( rule__Colonnesimple__Group__0 ) ) )
            // InternalGs1.g:217:2: ( ( rule__Colonnesimple__Group__0 ) )
            {
            // InternalGs1.g:217:2: ( ( rule__Colonnesimple__Group__0 ) )
            // InternalGs1.g:218:3: ( rule__Colonnesimple__Group__0 )
            {
             before(grammarAccess.getColonnesimpleAccess().getGroup()); 
            // InternalGs1.g:219:3: ( rule__Colonnesimple__Group__0 )
            // InternalGs1.g:219:4: rule__Colonnesimple__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Colonnesimple__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColonnesimpleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColonnesimple"


    // $ANTLR start "entryRuleExpression"
    // InternalGs1.g:228:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalGs1.g:229:1: ( ruleExpression EOF )
            // InternalGs1.g:230:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalGs1.g:237:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:241:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalGs1.g:242:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalGs1.g:242:2: ( ( rule__Expression__Alternatives ) )
            // InternalGs1.g:243:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalGs1.g:244:3: ( rule__Expression__Alternatives )
            // InternalGs1.g:244:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleExpressionBinaire"
    // InternalGs1.g:253:1: entryRuleExpressionBinaire : ruleExpressionBinaire EOF ;
    public final void entryRuleExpressionBinaire() throws RecognitionException {
        try {
            // InternalGs1.g:254:1: ( ruleExpressionBinaire EOF )
            // InternalGs1.g:255:1: ruleExpressionBinaire EOF
            {
             before(grammarAccess.getExpressionBinaireRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionBinaire();

            state._fsp--;

             after(grammarAccess.getExpressionBinaireRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionBinaire"


    // $ANTLR start "ruleExpressionBinaire"
    // InternalGs1.g:262:1: ruleExpressionBinaire : ( ( rule__ExpressionBinaire__Group__0 ) ) ;
    public final void ruleExpressionBinaire() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:266:2: ( ( ( rule__ExpressionBinaire__Group__0 ) ) )
            // InternalGs1.g:267:2: ( ( rule__ExpressionBinaire__Group__0 ) )
            {
            // InternalGs1.g:267:2: ( ( rule__ExpressionBinaire__Group__0 ) )
            // InternalGs1.g:268:3: ( rule__ExpressionBinaire__Group__0 )
            {
             before(grammarAccess.getExpressionBinaireAccess().getGroup()); 
            // InternalGs1.g:269:3: ( rule__ExpressionBinaire__Group__0 )
            // InternalGs1.g:269:4: rule__ExpressionBinaire__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBinaire__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionBinaireAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionBinaire"


    // $ANTLR start "entryRuleAccesVariable"
    // InternalGs1.g:278:1: entryRuleAccesVariable : ruleAccesVariable EOF ;
    public final void entryRuleAccesVariable() throws RecognitionException {
        try {
            // InternalGs1.g:279:1: ( ruleAccesVariable EOF )
            // InternalGs1.g:280:1: ruleAccesVariable EOF
            {
             before(grammarAccess.getAccesVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleAccesVariable();

            state._fsp--;

             after(grammarAccess.getAccesVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAccesVariable"


    // $ANTLR start "ruleAccesVariable"
    // InternalGs1.g:287:1: ruleAccesVariable : ( ( rule__AccesVariable__Group__0 ) ) ;
    public final void ruleAccesVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:291:2: ( ( ( rule__AccesVariable__Group__0 ) ) )
            // InternalGs1.g:292:2: ( ( rule__AccesVariable__Group__0 ) )
            {
            // InternalGs1.g:292:2: ( ( rule__AccesVariable__Group__0 ) )
            // InternalGs1.g:293:3: ( rule__AccesVariable__Group__0 )
            {
             before(grammarAccess.getAccesVariableAccess().getGroup()); 
            // InternalGs1.g:294:3: ( rule__AccesVariable__Group__0 )
            // InternalGs1.g:294:4: rule__AccesVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AccesVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccesVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccesVariable"


    // $ANTLR start "entryRuleOperateur"
    // InternalGs1.g:303:1: entryRuleOperateur : ruleOperateur EOF ;
    public final void entryRuleOperateur() throws RecognitionException {
        try {
            // InternalGs1.g:304:1: ( ruleOperateur EOF )
            // InternalGs1.g:305:1: ruleOperateur EOF
            {
             before(grammarAccess.getOperateurRule()); 
            pushFollow(FOLLOW_1);
            ruleOperateur();

            state._fsp--;

             after(grammarAccess.getOperateurRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperateur"


    // $ANTLR start "ruleOperateur"
    // InternalGs1.g:312:1: ruleOperateur : ( ( rule__Operateur__Group__0 ) ) ;
    public final void ruleOperateur() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:316:2: ( ( ( rule__Operateur__Group__0 ) ) )
            // InternalGs1.g:317:2: ( ( rule__Operateur__Group__0 ) )
            {
            // InternalGs1.g:317:2: ( ( rule__Operateur__Group__0 ) )
            // InternalGs1.g:318:3: ( rule__Operateur__Group__0 )
            {
             before(grammarAccess.getOperateurAccess().getGroup()); 
            // InternalGs1.g:319:3: ( rule__Operateur__Group__0 )
            // InternalGs1.g:319:4: rule__Operateur__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Operateur__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperateurAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperateur"


    // $ANTLR start "ruleOperations"
    // InternalGs1.g:328:1: ruleOperations : ( ( rule__Operations__Alternatives ) ) ;
    public final void ruleOperations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:332:1: ( ( ( rule__Operations__Alternatives ) ) )
            // InternalGs1.g:333:2: ( ( rule__Operations__Alternatives ) )
            {
            // InternalGs1.g:333:2: ( ( rule__Operations__Alternatives ) )
            // InternalGs1.g:334:3: ( rule__Operations__Alternatives )
            {
             before(grammarAccess.getOperationsAccess().getAlternatives()); 
            // InternalGs1.g:335:3: ( rule__Operations__Alternatives )
            // InternalGs1.g:335:4: rule__Operations__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operations__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperations"


    // $ANTLR start "rule__Colonne__Alternatives"
    // InternalGs1.g:343:1: rule__Colonne__Alternatives : ( ( ruleColonne_derivee ) | ( ruleColonne_referencee ) | ( ruleColonnesimple ) );
    public final void rule__Colonne__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:347:1: ( ( ruleColonne_derivee ) | ( ruleColonne_referencee ) | ( ruleColonnesimple ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 24:
                {
                alt2=2;
                }
                break;
            case 27:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGs1.g:348:2: ( ruleColonne_derivee )
                    {
                    // InternalGs1.g:348:2: ( ruleColonne_derivee )
                    // InternalGs1.g:349:3: ruleColonne_derivee
                    {
                     before(grammarAccess.getColonneAccess().getColonne_deriveeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleColonne_derivee();

                    state._fsp--;

                     after(grammarAccess.getColonneAccess().getColonne_deriveeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGs1.g:354:2: ( ruleColonne_referencee )
                    {
                    // InternalGs1.g:354:2: ( ruleColonne_referencee )
                    // InternalGs1.g:355:3: ruleColonne_referencee
                    {
                     before(grammarAccess.getColonneAccess().getColonne_referenceeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleColonne_referencee();

                    state._fsp--;

                     after(grammarAccess.getColonneAccess().getColonne_referenceeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGs1.g:360:2: ( ruleColonnesimple )
                    {
                    // InternalGs1.g:360:2: ( ruleColonnesimple )
                    // InternalGs1.g:361:3: ruleColonnesimple
                    {
                     before(grammarAccess.getColonneAccess().getColonnesimpleParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleColonnesimple();

                    state._fsp--;

                     after(grammarAccess.getColonneAccess().getColonnesimpleParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalGs1.g:370:1: rule__Expression__Alternatives : ( ( ruleExpressionBinaire ) | ( ruleAccesVariable ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:374:1: ( ( ruleExpressionBinaire ) | ( ruleAccesVariable ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==28) ) {
                alt3=1;
            }
            else if ( (LA3_0==32) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGs1.g:375:2: ( ruleExpressionBinaire )
                    {
                    // InternalGs1.g:375:2: ( ruleExpressionBinaire )
                    // InternalGs1.g:376:3: ruleExpressionBinaire
                    {
                     before(grammarAccess.getExpressionAccess().getExpressionBinaireParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExpressionBinaire();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getExpressionBinaireParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGs1.g:381:2: ( ruleAccesVariable )
                    {
                    // InternalGs1.g:381:2: ( ruleAccesVariable )
                    // InternalGs1.g:382:3: ruleAccesVariable
                    {
                     before(grammarAccess.getExpressionAccess().getAccesVariableParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAccesVariable();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getAccesVariableParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Operations__Alternatives"
    // InternalGs1.g:391:1: rule__Operations__Alternatives : ( ( ( 'addition' ) ) | ( ( 'soustraction' ) ) | ( ( 'multiplication' ) ) | ( ( 'division' ) ) );
    public final void rule__Operations__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:395:1: ( ( ( 'addition' ) ) | ( ( 'soustraction' ) ) | ( ( 'multiplication' ) ) | ( ( 'division' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalGs1.g:396:2: ( ( 'addition' ) )
                    {
                    // InternalGs1.g:396:2: ( ( 'addition' ) )
                    // InternalGs1.g:397:3: ( 'addition' )
                    {
                     before(grammarAccess.getOperationsAccess().getAdditionEnumLiteralDeclaration_0()); 
                    // InternalGs1.g:398:3: ( 'addition' )
                    // InternalGs1.g:398:4: 'addition'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationsAccess().getAdditionEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGs1.g:402:2: ( ( 'soustraction' ) )
                    {
                    // InternalGs1.g:402:2: ( ( 'soustraction' ) )
                    // InternalGs1.g:403:3: ( 'soustraction' )
                    {
                     before(grammarAccess.getOperationsAccess().getSoustractionEnumLiteralDeclaration_1()); 
                    // InternalGs1.g:404:3: ( 'soustraction' )
                    // InternalGs1.g:404:4: 'soustraction'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationsAccess().getSoustractionEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGs1.g:408:2: ( ( 'multiplication' ) )
                    {
                    // InternalGs1.g:408:2: ( ( 'multiplication' ) )
                    // InternalGs1.g:409:3: ( 'multiplication' )
                    {
                     before(grammarAccess.getOperationsAccess().getMultiplicationEnumLiteralDeclaration_2()); 
                    // InternalGs1.g:410:3: ( 'multiplication' )
                    // InternalGs1.g:410:4: 'multiplication'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationsAccess().getMultiplicationEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGs1.g:414:2: ( ( 'division' ) )
                    {
                    // InternalGs1.g:414:2: ( ( 'division' ) )
                    // InternalGs1.g:415:3: ( 'division' )
                    {
                     before(grammarAccess.getOperationsAccess().getDivisionEnumLiteralDeclaration_3()); 
                    // InternalGs1.g:416:3: ( 'division' )
                    // InternalGs1.g:416:4: 'division'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationsAccess().getDivisionEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operations__Alternatives"


    // $ANTLR start "rule__Application__Group__0"
    // InternalGs1.g:424:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:428:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // InternalGs1.g:429:2: rule__Application__Group__0__Impl rule__Application__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Application__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__0"


    // $ANTLR start "rule__Application__Group__0__Impl"
    // InternalGs1.g:436:1: rule__Application__Group__0__Impl : ( 'Application' ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:440:1: ( ( 'Application' ) )
            // InternalGs1.g:441:1: ( 'Application' )
            {
            // InternalGs1.g:441:1: ( 'Application' )
            // InternalGs1.g:442:2: 'Application'
            {
             before(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__0__Impl"


    // $ANTLR start "rule__Application__Group__1"
    // InternalGs1.g:451:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:455:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // InternalGs1.g:456:2: rule__Application__Group__1__Impl rule__Application__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Application__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__1"


    // $ANTLR start "rule__Application__Group__1__Impl"
    // InternalGs1.g:463:1: rule__Application__Group__1__Impl : ( '{' ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:467:1: ( ( '{' ) )
            // InternalGs1.g:468:1: ( '{' )
            {
            // InternalGs1.g:468:1: ( '{' )
            // InternalGs1.g:469:2: '{'
            {
             before(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__1__Impl"


    // $ANTLR start "rule__Application__Group__2"
    // InternalGs1.g:478:1: rule__Application__Group__2 : rule__Application__Group__2__Impl rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:482:1: ( rule__Application__Group__2__Impl rule__Application__Group__3 )
            // InternalGs1.g:483:2: rule__Application__Group__2__Impl rule__Application__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Application__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__2"


    // $ANTLR start "rule__Application__Group__2__Impl"
    // InternalGs1.g:490:1: rule__Application__Group__2__Impl : ( ( rule__Application__TablesAssignment_2 )* ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:494:1: ( ( ( rule__Application__TablesAssignment_2 )* ) )
            // InternalGs1.g:495:1: ( ( rule__Application__TablesAssignment_2 )* )
            {
            // InternalGs1.g:495:1: ( ( rule__Application__TablesAssignment_2 )* )
            // InternalGs1.g:496:2: ( rule__Application__TablesAssignment_2 )*
            {
             before(grammarAccess.getApplicationAccess().getTablesAssignment_2()); 
            // InternalGs1.g:497:2: ( rule__Application__TablesAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGs1.g:497:3: rule__Application__TablesAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Application__TablesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getApplicationAccess().getTablesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__2__Impl"


    // $ANTLR start "rule__Application__Group__3"
    // InternalGs1.g:505:1: rule__Application__Group__3 : rule__Application__Group__3__Impl ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:509:1: ( rule__Application__Group__3__Impl )
            // InternalGs1.g:510:2: rule__Application__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__3"


    // $ANTLR start "rule__Application__Group__3__Impl"
    // InternalGs1.g:516:1: rule__Application__Group__3__Impl : ( '}' ) ;
    public final void rule__Application__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:520:1: ( ( '}' ) )
            // InternalGs1.g:521:1: ( '}' )
            {
            // InternalGs1.g:521:1: ( '}' )
            // InternalGs1.g:522:2: '}'
            {
             before(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__3__Impl"


    // $ANTLR start "rule__Table__Group__0"
    // InternalGs1.g:532:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:536:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalGs1.g:537:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Table__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0"


    // $ANTLR start "rule__Table__Group__0__Impl"
    // InternalGs1.g:544:1: rule__Table__Group__0__Impl : ( 'Table' ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:548:1: ( ( 'Table' ) )
            // InternalGs1.g:549:1: ( 'Table' )
            {
            // InternalGs1.g:549:1: ( 'Table' )
            // InternalGs1.g:550:2: 'Table'
            {
             before(grammarAccess.getTableAccess().getTableKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getTableKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0__Impl"


    // $ANTLR start "rule__Table__Group__1"
    // InternalGs1.g:559:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:563:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalGs1.g:564:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Table__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1"


    // $ANTLR start "rule__Table__Group__1__Impl"
    // InternalGs1.g:571:1: rule__Table__Group__1__Impl : ( ( rule__Table__NameAssignment_1 ) ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:575:1: ( ( ( rule__Table__NameAssignment_1 ) ) )
            // InternalGs1.g:576:1: ( ( rule__Table__NameAssignment_1 ) )
            {
            // InternalGs1.g:576:1: ( ( rule__Table__NameAssignment_1 ) )
            // InternalGs1.g:577:2: ( rule__Table__NameAssignment_1 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_1()); 
            // InternalGs1.g:578:2: ( rule__Table__NameAssignment_1 )
            // InternalGs1.g:578:3: rule__Table__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Table__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1__Impl"


    // $ANTLR start "rule__Table__Group__2"
    // InternalGs1.g:586:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:590:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalGs1.g:591:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Table__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2"


    // $ANTLR start "rule__Table__Group__2__Impl"
    // InternalGs1.g:598:1: rule__Table__Group__2__Impl : ( '{' ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:602:1: ( ( '{' ) )
            // InternalGs1.g:603:1: ( '{' )
            {
            // InternalGs1.g:603:1: ( '{' )
            // InternalGs1.g:604:2: '{'
            {
             before(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2__Impl"


    // $ANTLR start "rule__Table__Group__3"
    // InternalGs1.g:613:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:617:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalGs1.g:618:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Table__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3"


    // $ANTLR start "rule__Table__Group__3__Impl"
    // InternalGs1.g:625:1: rule__Table__Group__3__Impl : ( 'id' ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:629:1: ( ( 'id' ) )
            // InternalGs1.g:630:1: ( 'id' )
            {
            // InternalGs1.g:630:1: ( 'id' )
            // InternalGs1.g:631:2: 'id'
            {
             before(grammarAccess.getTableAccess().getIdKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getIdKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3__Impl"


    // $ANTLR start "rule__Table__Group__4"
    // InternalGs1.g:640:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:644:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalGs1.g:645:2: rule__Table__Group__4__Impl rule__Table__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Table__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__4"


    // $ANTLR start "rule__Table__Group__4__Impl"
    // InternalGs1.g:652:1: rule__Table__Group__4__Impl : ( '=' ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:656:1: ( ( '=' ) )
            // InternalGs1.g:657:1: ( '=' )
            {
            // InternalGs1.g:657:1: ( '=' )
            // InternalGs1.g:658:2: '='
            {
             before(grammarAccess.getTableAccess().getEqualsSignKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__4__Impl"


    // $ANTLR start "rule__Table__Group__5"
    // InternalGs1.g:667:1: rule__Table__Group__5 : rule__Table__Group__5__Impl rule__Table__Group__6 ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:671:1: ( rule__Table__Group__5__Impl rule__Table__Group__6 )
            // InternalGs1.g:672:2: rule__Table__Group__5__Impl rule__Table__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Table__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__5"


    // $ANTLR start "rule__Table__Group__5__Impl"
    // InternalGs1.g:679:1: rule__Table__Group__5__Impl : ( ( rule__Table__IdAssignment_5 ) ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:683:1: ( ( ( rule__Table__IdAssignment_5 ) ) )
            // InternalGs1.g:684:1: ( ( rule__Table__IdAssignment_5 ) )
            {
            // InternalGs1.g:684:1: ( ( rule__Table__IdAssignment_5 ) )
            // InternalGs1.g:685:2: ( rule__Table__IdAssignment_5 )
            {
             before(grammarAccess.getTableAccess().getIdAssignment_5()); 
            // InternalGs1.g:686:2: ( rule__Table__IdAssignment_5 )
            // InternalGs1.g:686:3: rule__Table__IdAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Table__IdAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getIdAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__5__Impl"


    // $ANTLR start "rule__Table__Group__6"
    // InternalGs1.g:694:1: rule__Table__Group__6 : rule__Table__Group__6__Impl rule__Table__Group__7 ;
    public final void rule__Table__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:698:1: ( rule__Table__Group__6__Impl rule__Table__Group__7 )
            // InternalGs1.g:699:2: rule__Table__Group__6__Impl rule__Table__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Table__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__6"


    // $ANTLR start "rule__Table__Group__6__Impl"
    // InternalGs1.g:706:1: rule__Table__Group__6__Impl : ( 'Nom' ) ;
    public final void rule__Table__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:710:1: ( ( 'Nom' ) )
            // InternalGs1.g:711:1: ( 'Nom' )
            {
            // InternalGs1.g:711:1: ( 'Nom' )
            // InternalGs1.g:712:2: 'Nom'
            {
             before(grammarAccess.getTableAccess().getNomKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getNomKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__6__Impl"


    // $ANTLR start "rule__Table__Group__7"
    // InternalGs1.g:721:1: rule__Table__Group__7 : rule__Table__Group__7__Impl rule__Table__Group__8 ;
    public final void rule__Table__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:725:1: ( rule__Table__Group__7__Impl rule__Table__Group__8 )
            // InternalGs1.g:726:2: rule__Table__Group__7__Impl rule__Table__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__Table__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__7"


    // $ANTLR start "rule__Table__Group__7__Impl"
    // InternalGs1.g:733:1: rule__Table__Group__7__Impl : ( '=' ) ;
    public final void rule__Table__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:737:1: ( ( '=' ) )
            // InternalGs1.g:738:1: ( '=' )
            {
            // InternalGs1.g:738:1: ( '=' )
            // InternalGs1.g:739:2: '='
            {
             before(grammarAccess.getTableAccess().getEqualsSignKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getEqualsSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__7__Impl"


    // $ANTLR start "rule__Table__Group__8"
    // InternalGs1.g:748:1: rule__Table__Group__8 : rule__Table__Group__8__Impl rule__Table__Group__9 ;
    public final void rule__Table__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:752:1: ( rule__Table__Group__8__Impl rule__Table__Group__9 )
            // InternalGs1.g:753:2: rule__Table__Group__8__Impl rule__Table__Group__9
            {
            pushFollow(FOLLOW_13);
            rule__Table__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__8"


    // $ANTLR start "rule__Table__Group__8__Impl"
    // InternalGs1.g:760:1: rule__Table__Group__8__Impl : ( ( rule__Table__NomAssignment_8 ) ) ;
    public final void rule__Table__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:764:1: ( ( ( rule__Table__NomAssignment_8 ) ) )
            // InternalGs1.g:765:1: ( ( rule__Table__NomAssignment_8 ) )
            {
            // InternalGs1.g:765:1: ( ( rule__Table__NomAssignment_8 ) )
            // InternalGs1.g:766:2: ( rule__Table__NomAssignment_8 )
            {
             before(grammarAccess.getTableAccess().getNomAssignment_8()); 
            // InternalGs1.g:767:2: ( rule__Table__NomAssignment_8 )
            // InternalGs1.g:767:3: rule__Table__NomAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Table__NomAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getNomAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__8__Impl"


    // $ANTLR start "rule__Table__Group__9"
    // InternalGs1.g:775:1: rule__Table__Group__9 : rule__Table__Group__9__Impl rule__Table__Group__10 ;
    public final void rule__Table__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:779:1: ( rule__Table__Group__9__Impl rule__Table__Group__10 )
            // InternalGs1.g:780:2: rule__Table__Group__9__Impl rule__Table__Group__10
            {
            pushFollow(FOLLOW_13);
            rule__Table__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__9"


    // $ANTLR start "rule__Table__Group__9__Impl"
    // InternalGs1.g:787:1: rule__Table__Group__9__Impl : ( ( rule__Table__ColonnesAssignment_9 )* ) ;
    public final void rule__Table__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:791:1: ( ( ( rule__Table__ColonnesAssignment_9 )* ) )
            // InternalGs1.g:792:1: ( ( rule__Table__ColonnesAssignment_9 )* )
            {
            // InternalGs1.g:792:1: ( ( rule__Table__ColonnesAssignment_9 )* )
            // InternalGs1.g:793:2: ( rule__Table__ColonnesAssignment_9 )*
            {
             before(grammarAccess.getTableAccess().getColonnesAssignment_9()); 
            // InternalGs1.g:794:2: ( rule__Table__ColonnesAssignment_9 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22||LA6_0==24||LA6_0==27) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGs1.g:794:3: rule__Table__ColonnesAssignment_9
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Table__ColonnesAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getTableAccess().getColonnesAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__9__Impl"


    // $ANTLR start "rule__Table__Group__10"
    // InternalGs1.g:802:1: rule__Table__Group__10 : rule__Table__Group__10__Impl ;
    public final void rule__Table__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:806:1: ( rule__Table__Group__10__Impl )
            // InternalGs1.g:807:2: rule__Table__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__10"


    // $ANTLR start "rule__Table__Group__10__Impl"
    // InternalGs1.g:813:1: rule__Table__Group__10__Impl : ( '}' ) ;
    public final void rule__Table__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:817:1: ( ( '}' ) )
            // InternalGs1.g:818:1: ( '}' )
            {
            // InternalGs1.g:818:1: ( '}' )
            // InternalGs1.g:819:2: '}'
            {
             before(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_10()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__10__Impl"


    // $ANTLR start "rule__Colonne_derivee__Group__0"
    // InternalGs1.g:829:1: rule__Colonne_derivee__Group__0 : rule__Colonne_derivee__Group__0__Impl rule__Colonne_derivee__Group__1 ;
    public final void rule__Colonne_derivee__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:833:1: ( rule__Colonne_derivee__Group__0__Impl rule__Colonne_derivee__Group__1 )
            // InternalGs1.g:834:2: rule__Colonne_derivee__Group__0__Impl rule__Colonne_derivee__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Colonne_derivee__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonne_derivee__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_derivee__Group__0"


    // $ANTLR start "rule__Colonne_derivee__Group__0__Impl"
    // InternalGs1.g:841:1: rule__Colonne_derivee__Group__0__Impl : ( 'Colonne_derivee' ) ;
    public final void rule__Colonne_derivee__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:845:1: ( ( 'Colonne_derivee' ) )
            // InternalGs1.g:846:1: ( 'Colonne_derivee' )
            {
            // InternalGs1.g:846:1: ( 'Colonne_derivee' )
            // InternalGs1.g:847:2: 'Colonne_derivee'
            {
             before(grammarAccess.getColonne_deriveeAccess().getColonne_deriveeKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getColonne_deriveeAccess().getColonne_deriveeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_derivee__Group__0__Impl"


    // $ANTLR start "rule__Colonne_derivee__Group__1"
    // InternalGs1.g:856:1: rule__Colonne_derivee__Group__1 : rule__Colonne_derivee__Group__1__Impl rule__Colonne_derivee__Group__2 ;
    public final void rule__Colonne_derivee__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:860:1: ( rule__Colonne_derivee__Group__1__Impl rule__Colonne_derivee__Group__2 )
            // InternalGs1.g:861:2: rule__Colonne_derivee__Group__1__Impl rule__Colonne_derivee__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Colonne_derivee__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonne_derivee__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_derivee__Group__1"


    // $ANTLR start "rule__Colonne_derivee__Group__1__Impl"
    // InternalGs1.g:868:1: rule__Colonne_derivee__Group__1__Impl : ( ( rule__Colonne_derivee__NameAssignment_1 ) ) ;
    public final void rule__Colonne_derivee__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:872:1: ( ( ( rule__Colonne_derivee__NameAssignment_1 ) ) )
            // InternalGs1.g:873:1: ( ( rule__Colonne_derivee__NameAssignment_1 ) )
            {
            // InternalGs1.g:873:1: ( ( rule__Colonne_derivee__NameAssignment_1 ) )
            // InternalGs1.g:874:2: ( rule__Colonne_derivee__NameAssignment_1 )
            {
             before(grammarAccess.getColonne_deriveeAccess().getNameAssignment_1()); 
            // InternalGs1.g:875:2: ( rule__Colonne_derivee__NameAssignment_1 )
            // InternalGs1.g:875:3: rule__Colonne_derivee__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Colonne_derivee__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getColonne_deriveeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_derivee__Group__1__Impl"


    // $ANTLR start "rule__Colonne_derivee__Group__2"
    // InternalGs1.g:883:1: rule__Colonne_derivee__Group__2 : rule__Colonne_derivee__Group__2__Impl rule__Colonne_derivee__Group__3 ;
    public final void rule__Colonne_derivee__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:887:1: ( rule__Colonne_derivee__Group__2__Impl rule__Colonne_derivee__Group__3 )
            // InternalGs1.g:888:2: rule__Colonne_derivee__Group__2__Impl rule__Colonne_derivee__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Colonne_derivee__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonne_derivee__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_derivee__Group__2"


    // $ANTLR start "rule__Colonne_derivee__Group__2__Impl"
    // InternalGs1.g:895:1: rule__Colonne_derivee__Group__2__Impl : ( '{' ) ;
    public final void rule__Colonne_derivee__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:899:1: ( ( '{' ) )
            // InternalGs1.g:900:1: ( '{' )
            {
            // InternalGs1.g:900:1: ( '{' )
            // InternalGs1.g:901:2: '{'
            {
             before(grammarAccess.getColonne_deriveeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getColonne_deriveeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_derivee__Group__2__Impl"


    // $ANTLR start "rule__Colonne_derivee__Group__3"
    // InternalGs1.g:910:1: rule__Colonne_derivee__Group__3 : rule__Colonne_derivee__Group__3__Impl rule__Colonne_derivee__Group__4 ;
    public final void rule__Colonne_derivee__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:914:1: ( rule__Colonne_derivee__Group__3__Impl rule__Colonne_derivee__Group__4 )
            // InternalGs1.g:915:2: rule__Colonne_derivee__Group__3__Impl rule__Colonne_derivee__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Colonne_derivee__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonne_derivee__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_derivee__Group__3"


    // $ANTLR start "rule__Colonne_derivee__Group__3__Impl"
    // InternalGs1.g:922:1: rule__Colonne_derivee__Group__3__Impl : ( 'id' ) ;
    public final void rule__Colonne_derivee__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:926:1: ( ( 'id' ) )
            // InternalGs1.g:927:1: ( 'id' )
            {
            // InternalGs1.g:927:1: ( 'id' )
            // InternalGs1.g:928:2: 'id'
            {
             before(grammarAccess.getColonne_deriveeAccess().getIdKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getColonne_deriveeAccess().getIdKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_derivee__Group__3__Impl"


    // $ANTLR start "rule__Colonne_derivee__Group__4"
    // InternalGs1.g:937:1: rule__Colonne_derivee__Group__4 : rule__Colonne_derivee__Group__4__Impl rule__Colonne_derivee__Group__5 ;
    public final void rule__Colonne_derivee__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:941:1: ( rule__Colonne_derivee__Group__4__Impl rule__Colonne_derivee__Group__5 )
            // InternalGs1.g:942:2: rule__Colonne_derivee__Group__4__Impl rule__Colonne_derivee__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Colonne_derivee__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonne_derivee__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_derivee__Group__4"


    // $ANTLR start "rule__Colonne_derivee__Group__4__Impl"
    // InternalGs1.g:949:1: rule__Colonne_derivee__Group__4__Impl : ( '=' ) ;
    public final void rule__Colonne_derivee__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:953:1: ( ( '=' ) )
            // InternalGs1.g:954:1: ( '=' )
            {
            // InternalGs1.g:954:1: ( '=' )
            // InternalGs1.g:955:2: '='
            {
             before(grammarAccess.getColonne_deriveeAccess().getEqualsSignKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getColonne_deriveeAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_derivee__Group__4__Impl"


    // $ANTLR start "rule__Colonne_derivee__Group__5"
    // InternalGs1.g:964:1: rule__Colonne_derivee__Group__5 : rule__Colonne_derivee__Group__5__Impl rule__Colonne_derivee__Group__6 ;
    public final void rule__Colonne_derivee__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:968:1: ( rule__Colonne_derivee__Group__5__Impl rule__Colonne_derivee__Group__6 )
            // InternalGs1.g:969:2: rule__Colonne_derivee__Group__5__Impl rule__Colonne_derivee__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Colonne_derivee__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonne_derivee__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_derivee__Group__5"


    // $ANTLR start "rule__Colonne_derivee__Group__5__Impl"
    // InternalGs1.g:976:1: rule__Colonne_derivee__Group__5__Impl : ( ( rule__Colonne_derivee__IdAssignment_5 ) ) ;
    public final void rule__Colonne_derivee__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:980:1: ( ( ( rule__Colonne_derivee__IdAssignment_5 ) ) )
            // InternalGs1.g:981:1: ( ( rule__Colonne_derivee__IdAssignment_5 ) )
            {
            // InternalGs1.g:981:1: ( ( rule__Colonne_derivee__IdAssignment_5 ) )
            // InternalGs1.g:982:2: ( rule__Colonne_derivee__IdAssignment_5 )
            {
             before(grammarAccess.getColonne_deriveeAccess().getIdAssignment_5()); 
            // InternalGs1.g:983:2: ( rule__Colonne_derivee__IdAssignment_5 )
            // InternalGs1.g:983:3: rule__Colonne_derivee__IdAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Colonne_derivee__IdAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getColonne_deriveeAccess().getIdAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_derivee__Group__5__Impl"


    // $ANTLR start "rule__Colonne_derivee__Group__6"
    // InternalGs1.g:991:1: rule__Colonne_derivee__Group__6 : rule__Colonne_derivee__Group__6__Impl rule__Colonne_derivee__Group__7 ;
    public final void rule__Colonne_derivee__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:995:1: ( rule__Colonne_derivee__Group__6__Impl rule__Colonne_derivee__Group__7 )
            // InternalGs1.g:996:2: rule__Colonne_derivee__Group__6__Impl rule__Colonne_derivee__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Colonne_derivee__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonne_derivee__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_derivee__Group__6"


    // $ANTLR start "rule__Colonne_derivee__Group__6__Impl"
    // InternalGs1.g:1003:1: rule__Colonne_derivee__Group__6__Impl : ( 'Nom' ) ;
    public final void rule__Colonne_derivee__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1007:1: ( ( 'Nom' ) )
            // InternalGs1.g:1008:1: ( 'Nom' )
            {
            // InternalGs1.g:1008:1: ( 'Nom' )
            // InternalGs1.g:1009:2: 'Nom'
            {
             before(grammarAccess.getColonne_deriveeAccess().getNomKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getColonne_deriveeAccess().getNomKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_derivee__Group__6__Impl"


    // $ANTLR start "rule__Colonne_derivee__Group__7"
    // InternalGs1.g:1018:1: rule__Colonne_derivee__Group__7 : rule__Colonne_derivee__Group__7__Impl rule__Colonne_derivee__Group__8 ;
    public final void rule__Colonne_derivee__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1022:1: ( rule__Colonne_derivee__Group__7__Impl rule__Colonne_derivee__Group__8 )
            // InternalGs1.g:1023:2: rule__Colonne_derivee__Group__7__Impl rule__Colonne_derivee__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__Colonne_derivee__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonne_derivee__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_derivee__Group__7"


    // $ANTLR start "rule__Colonne_derivee__Group__7__Impl"
    // InternalGs1.g:1030:1: rule__Colonne_derivee__Group__7__Impl : ( '=' ) ;
    public final void rule__Colonne_derivee__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1034:1: ( ( '=' ) )
            // InternalGs1.g:1035:1: ( '=' )
            {
            // InternalGs1.g:1035:1: ( '=' )
            // InternalGs1.g:1036:2: '='
            {
             before(grammarAccess.getColonne_deriveeAccess().getEqualsSignKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getColonne_deriveeAccess().getEqualsSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_derivee__Group__7__Impl"


    // $ANTLR start "rule__Colonne_derivee__Group__8"
    // InternalGs1.g:1045:1: rule__Colonne_derivee__Group__8 : rule__Colonne_derivee__Group__8__Impl rule__Colonne_derivee__Group__9 ;
    public final void rule__Colonne_derivee__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1049:1: ( rule__Colonne_derivee__Group__8__Impl rule__Colonne_derivee__Group__9 )
            // InternalGs1.g:1050:2: rule__Colonne_derivee__Group__8__Impl rule__Colonne_derivee__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__Colonne_derivee__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonne_derivee__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_derivee__Group__8"


    // $ANTLR start "rule__Colonne_derivee__Group__8__Impl"
    // InternalGs1.g:1057:1: rule__Colonne_derivee__Group__8__Impl : ( ( rule__Colonne_derivee__NomAssignment_8 ) ) ;
    public final void rule__Colonne_derivee__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1061:1: ( ( ( rule__Colonne_derivee__NomAssignment_8 ) ) )
            // InternalGs1.g:1062:1: ( ( rule__Colonne_derivee__NomAssignment_8 ) )
            {
            // InternalGs1.g:1062:1: ( ( rule__Colonne_derivee__NomAssignment_8 ) )
            // InternalGs1.g:1063:2: ( rule__Colonne_derivee__NomAssignment_8 )
            {
             before(grammarAccess.getColonne_deriveeAccess().getNomAssignment_8()); 
            // InternalGs1.g:1064:2: ( rule__Colonne_derivee__NomAssignment_8 )
            // InternalGs1.g:1064:3: rule__Colonne_derivee__NomAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Colonne_derivee__NomAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getColonne_deriveeAccess().getNomAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_derivee__Group__8__Impl"


    // $ANTLR start "rule__Colonne_derivee__Group__9"
    // InternalGs1.g:1072:1: rule__Colonne_derivee__Group__9 : rule__Colonne_derivee__Group__9__Impl rule__Colonne_derivee__Group__10 ;
    public final void rule__Colonne_derivee__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1076:1: ( rule__Colonne_derivee__Group__9__Impl rule__Colonne_derivee__Group__10 )
            // InternalGs1.g:1077:2: rule__Colonne_derivee__Group__9__Impl rule__Colonne_derivee__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__Colonne_derivee__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonne_derivee__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_derivee__Group__9"


    // $ANTLR start "rule__Colonne_derivee__Group__9__Impl"
    // InternalGs1.g:1084:1: rule__Colonne_derivee__Group__9__Impl : ( 'expression' ) ;
    public final void rule__Colonne_derivee__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1088:1: ( ( 'expression' ) )
            // InternalGs1.g:1089:1: ( 'expression' )
            {
            // InternalGs1.g:1089:1: ( 'expression' )
            // InternalGs1.g:1090:2: 'expression'
            {
             before(grammarAccess.getColonne_deriveeAccess().getExpressionKeyword_9()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getColonne_deriveeAccess().getExpressionKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_derivee__Group__9__Impl"


    // $ANTLR start "rule__Colonne_derivee__Group__10"
    // InternalGs1.g:1099:1: rule__Colonne_derivee__Group__10 : rule__Colonne_derivee__Group__10__Impl rule__Colonne_derivee__Group__11 ;
    public final void rule__Colonne_derivee__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1103:1: ( rule__Colonne_derivee__Group__10__Impl rule__Colonne_derivee__Group__11 )
            // InternalGs1.g:1104:2: rule__Colonne_derivee__Group__10__Impl rule__Colonne_derivee__Group__11
            {
            pushFollow(FOLLOW_16);
            rule__Colonne_derivee__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonne_derivee__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_derivee__Group__10"


    // $ANTLR start "rule__Colonne_derivee__Group__10__Impl"
    // InternalGs1.g:1111:1: rule__Colonne_derivee__Group__10__Impl : ( '=' ) ;
    public final void rule__Colonne_derivee__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1115:1: ( ( '=' ) )
            // InternalGs1.g:1116:1: ( '=' )
            {
            // InternalGs1.g:1116:1: ( '=' )
            // InternalGs1.g:1117:2: '='
            {
             before(grammarAccess.getColonne_deriveeAccess().getEqualsSignKeyword_10()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getColonne_deriveeAccess().getEqualsSignKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_derivee__Group__10__Impl"


    // $ANTLR start "rule__Colonne_derivee__Group__11"
    // InternalGs1.g:1126:1: rule__Colonne_derivee__Group__11 : rule__Colonne_derivee__Group__11__Impl rule__Colonne_derivee__Group__12 ;
    public final void rule__Colonne_derivee__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1130:1: ( rule__Colonne_derivee__Group__11__Impl rule__Colonne_derivee__Group__12 )
            // InternalGs1.g:1131:2: rule__Colonne_derivee__Group__11__Impl rule__Colonne_derivee__Group__12
            {
            pushFollow(FOLLOW_17);
            rule__Colonne_derivee__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonne_derivee__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_derivee__Group__11"


    // $ANTLR start "rule__Colonne_derivee__Group__11__Impl"
    // InternalGs1.g:1138:1: rule__Colonne_derivee__Group__11__Impl : ( ( rule__Colonne_derivee__ExpressionAssignment_11 ) ) ;
    public final void rule__Colonne_derivee__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1142:1: ( ( ( rule__Colonne_derivee__ExpressionAssignment_11 ) ) )
            // InternalGs1.g:1143:1: ( ( rule__Colonne_derivee__ExpressionAssignment_11 ) )
            {
            // InternalGs1.g:1143:1: ( ( rule__Colonne_derivee__ExpressionAssignment_11 ) )
            // InternalGs1.g:1144:2: ( rule__Colonne_derivee__ExpressionAssignment_11 )
            {
             before(grammarAccess.getColonne_deriveeAccess().getExpressionAssignment_11()); 
            // InternalGs1.g:1145:2: ( rule__Colonne_derivee__ExpressionAssignment_11 )
            // InternalGs1.g:1145:3: rule__Colonne_derivee__ExpressionAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Colonne_derivee__ExpressionAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getColonne_deriveeAccess().getExpressionAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_derivee__Group__11__Impl"


    // $ANTLR start "rule__Colonne_derivee__Group__12"
    // InternalGs1.g:1153:1: rule__Colonne_derivee__Group__12 : rule__Colonne_derivee__Group__12__Impl ;
    public final void rule__Colonne_derivee__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1157:1: ( rule__Colonne_derivee__Group__12__Impl )
            // InternalGs1.g:1158:2: rule__Colonne_derivee__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Colonne_derivee__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_derivee__Group__12"


    // $ANTLR start "rule__Colonne_derivee__Group__12__Impl"
    // InternalGs1.g:1164:1: rule__Colonne_derivee__Group__12__Impl : ( '}' ) ;
    public final void rule__Colonne_derivee__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1168:1: ( ( '}' ) )
            // InternalGs1.g:1169:1: ( '}' )
            {
            // InternalGs1.g:1169:1: ( '}' )
            // InternalGs1.g:1170:2: '}'
            {
             before(grammarAccess.getColonne_deriveeAccess().getRightCurlyBracketKeyword_12()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getColonne_deriveeAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_derivee__Group__12__Impl"


    // $ANTLR start "rule__Colonne_referencee__Group__0"
    // InternalGs1.g:1180:1: rule__Colonne_referencee__Group__0 : rule__Colonne_referencee__Group__0__Impl rule__Colonne_referencee__Group__1 ;
    public final void rule__Colonne_referencee__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1184:1: ( rule__Colonne_referencee__Group__0__Impl rule__Colonne_referencee__Group__1 )
            // InternalGs1.g:1185:2: rule__Colonne_referencee__Group__0__Impl rule__Colonne_referencee__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Colonne_referencee__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonne_referencee__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_referencee__Group__0"


    // $ANTLR start "rule__Colonne_referencee__Group__0__Impl"
    // InternalGs1.g:1192:1: rule__Colonne_referencee__Group__0__Impl : ( 'Colonne_referencee' ) ;
    public final void rule__Colonne_referencee__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1196:1: ( ( 'Colonne_referencee' ) )
            // InternalGs1.g:1197:1: ( 'Colonne_referencee' )
            {
            // InternalGs1.g:1197:1: ( 'Colonne_referencee' )
            // InternalGs1.g:1198:2: 'Colonne_referencee'
            {
             before(grammarAccess.getColonne_referenceeAccess().getColonne_referenceeKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getColonne_referenceeAccess().getColonne_referenceeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_referencee__Group__0__Impl"


    // $ANTLR start "rule__Colonne_referencee__Group__1"
    // InternalGs1.g:1207:1: rule__Colonne_referencee__Group__1 : rule__Colonne_referencee__Group__1__Impl rule__Colonne_referencee__Group__2 ;
    public final void rule__Colonne_referencee__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1211:1: ( rule__Colonne_referencee__Group__1__Impl rule__Colonne_referencee__Group__2 )
            // InternalGs1.g:1212:2: rule__Colonne_referencee__Group__1__Impl rule__Colonne_referencee__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Colonne_referencee__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonne_referencee__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_referencee__Group__1"


    // $ANTLR start "rule__Colonne_referencee__Group__1__Impl"
    // InternalGs1.g:1219:1: rule__Colonne_referencee__Group__1__Impl : ( ( rule__Colonne_referencee__NameAssignment_1 ) ) ;
    public final void rule__Colonne_referencee__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1223:1: ( ( ( rule__Colonne_referencee__NameAssignment_1 ) ) )
            // InternalGs1.g:1224:1: ( ( rule__Colonne_referencee__NameAssignment_1 ) )
            {
            // InternalGs1.g:1224:1: ( ( rule__Colonne_referencee__NameAssignment_1 ) )
            // InternalGs1.g:1225:2: ( rule__Colonne_referencee__NameAssignment_1 )
            {
             before(grammarAccess.getColonne_referenceeAccess().getNameAssignment_1()); 
            // InternalGs1.g:1226:2: ( rule__Colonne_referencee__NameAssignment_1 )
            // InternalGs1.g:1226:3: rule__Colonne_referencee__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Colonne_referencee__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getColonne_referenceeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_referencee__Group__1__Impl"


    // $ANTLR start "rule__Colonne_referencee__Group__2"
    // InternalGs1.g:1234:1: rule__Colonne_referencee__Group__2 : rule__Colonne_referencee__Group__2__Impl rule__Colonne_referencee__Group__3 ;
    public final void rule__Colonne_referencee__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1238:1: ( rule__Colonne_referencee__Group__2__Impl rule__Colonne_referencee__Group__3 )
            // InternalGs1.g:1239:2: rule__Colonne_referencee__Group__2__Impl rule__Colonne_referencee__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Colonne_referencee__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonne_referencee__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_referencee__Group__2"


    // $ANTLR start "rule__Colonne_referencee__Group__2__Impl"
    // InternalGs1.g:1246:1: rule__Colonne_referencee__Group__2__Impl : ( '{' ) ;
    public final void rule__Colonne_referencee__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1250:1: ( ( '{' ) )
            // InternalGs1.g:1251:1: ( '{' )
            {
            // InternalGs1.g:1251:1: ( '{' )
            // InternalGs1.g:1252:2: '{'
            {
             before(grammarAccess.getColonne_referenceeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getColonne_referenceeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_referencee__Group__2__Impl"


    // $ANTLR start "rule__Colonne_referencee__Group__3"
    // InternalGs1.g:1261:1: rule__Colonne_referencee__Group__3 : rule__Colonne_referencee__Group__3__Impl rule__Colonne_referencee__Group__4 ;
    public final void rule__Colonne_referencee__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1265:1: ( rule__Colonne_referencee__Group__3__Impl rule__Colonne_referencee__Group__4 )
            // InternalGs1.g:1266:2: rule__Colonne_referencee__Group__3__Impl rule__Colonne_referencee__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Colonne_referencee__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonne_referencee__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_referencee__Group__3"


    // $ANTLR start "rule__Colonne_referencee__Group__3__Impl"
    // InternalGs1.g:1273:1: rule__Colonne_referencee__Group__3__Impl : ( 'id' ) ;
    public final void rule__Colonne_referencee__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1277:1: ( ( 'id' ) )
            // InternalGs1.g:1278:1: ( 'id' )
            {
            // InternalGs1.g:1278:1: ( 'id' )
            // InternalGs1.g:1279:2: 'id'
            {
             before(grammarAccess.getColonne_referenceeAccess().getIdKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getColonne_referenceeAccess().getIdKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_referencee__Group__3__Impl"


    // $ANTLR start "rule__Colonne_referencee__Group__4"
    // InternalGs1.g:1288:1: rule__Colonne_referencee__Group__4 : rule__Colonne_referencee__Group__4__Impl rule__Colonne_referencee__Group__5 ;
    public final void rule__Colonne_referencee__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1292:1: ( rule__Colonne_referencee__Group__4__Impl rule__Colonne_referencee__Group__5 )
            // InternalGs1.g:1293:2: rule__Colonne_referencee__Group__4__Impl rule__Colonne_referencee__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Colonne_referencee__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonne_referencee__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_referencee__Group__4"


    // $ANTLR start "rule__Colonne_referencee__Group__4__Impl"
    // InternalGs1.g:1300:1: rule__Colonne_referencee__Group__4__Impl : ( '=' ) ;
    public final void rule__Colonne_referencee__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1304:1: ( ( '=' ) )
            // InternalGs1.g:1305:1: ( '=' )
            {
            // InternalGs1.g:1305:1: ( '=' )
            // InternalGs1.g:1306:2: '='
            {
             before(grammarAccess.getColonne_referenceeAccess().getEqualsSignKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getColonne_referenceeAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_referencee__Group__4__Impl"


    // $ANTLR start "rule__Colonne_referencee__Group__5"
    // InternalGs1.g:1315:1: rule__Colonne_referencee__Group__5 : rule__Colonne_referencee__Group__5__Impl rule__Colonne_referencee__Group__6 ;
    public final void rule__Colonne_referencee__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1319:1: ( rule__Colonne_referencee__Group__5__Impl rule__Colonne_referencee__Group__6 )
            // InternalGs1.g:1320:2: rule__Colonne_referencee__Group__5__Impl rule__Colonne_referencee__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Colonne_referencee__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonne_referencee__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_referencee__Group__5"


    // $ANTLR start "rule__Colonne_referencee__Group__5__Impl"
    // InternalGs1.g:1327:1: rule__Colonne_referencee__Group__5__Impl : ( ( rule__Colonne_referencee__IdAssignment_5 ) ) ;
    public final void rule__Colonne_referencee__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1331:1: ( ( ( rule__Colonne_referencee__IdAssignment_5 ) ) )
            // InternalGs1.g:1332:1: ( ( rule__Colonne_referencee__IdAssignment_5 ) )
            {
            // InternalGs1.g:1332:1: ( ( rule__Colonne_referencee__IdAssignment_5 ) )
            // InternalGs1.g:1333:2: ( rule__Colonne_referencee__IdAssignment_5 )
            {
             before(grammarAccess.getColonne_referenceeAccess().getIdAssignment_5()); 
            // InternalGs1.g:1334:2: ( rule__Colonne_referencee__IdAssignment_5 )
            // InternalGs1.g:1334:3: rule__Colonne_referencee__IdAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Colonne_referencee__IdAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getColonne_referenceeAccess().getIdAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_referencee__Group__5__Impl"


    // $ANTLR start "rule__Colonne_referencee__Group__6"
    // InternalGs1.g:1342:1: rule__Colonne_referencee__Group__6 : rule__Colonne_referencee__Group__6__Impl rule__Colonne_referencee__Group__7 ;
    public final void rule__Colonne_referencee__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1346:1: ( rule__Colonne_referencee__Group__6__Impl rule__Colonne_referencee__Group__7 )
            // InternalGs1.g:1347:2: rule__Colonne_referencee__Group__6__Impl rule__Colonne_referencee__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Colonne_referencee__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonne_referencee__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_referencee__Group__6"


    // $ANTLR start "rule__Colonne_referencee__Group__6__Impl"
    // InternalGs1.g:1354:1: rule__Colonne_referencee__Group__6__Impl : ( 'Nom' ) ;
    public final void rule__Colonne_referencee__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1358:1: ( ( 'Nom' ) )
            // InternalGs1.g:1359:1: ( 'Nom' )
            {
            // InternalGs1.g:1359:1: ( 'Nom' )
            // InternalGs1.g:1360:2: 'Nom'
            {
             before(grammarAccess.getColonne_referenceeAccess().getNomKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getColonne_referenceeAccess().getNomKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_referencee__Group__6__Impl"


    // $ANTLR start "rule__Colonne_referencee__Group__7"
    // InternalGs1.g:1369:1: rule__Colonne_referencee__Group__7 : rule__Colonne_referencee__Group__7__Impl rule__Colonne_referencee__Group__8 ;
    public final void rule__Colonne_referencee__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1373:1: ( rule__Colonne_referencee__Group__7__Impl rule__Colonne_referencee__Group__8 )
            // InternalGs1.g:1374:2: rule__Colonne_referencee__Group__7__Impl rule__Colonne_referencee__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__Colonne_referencee__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonne_referencee__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_referencee__Group__7"


    // $ANTLR start "rule__Colonne_referencee__Group__7__Impl"
    // InternalGs1.g:1381:1: rule__Colonne_referencee__Group__7__Impl : ( '=' ) ;
    public final void rule__Colonne_referencee__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1385:1: ( ( '=' ) )
            // InternalGs1.g:1386:1: ( '=' )
            {
            // InternalGs1.g:1386:1: ( '=' )
            // InternalGs1.g:1387:2: '='
            {
             before(grammarAccess.getColonne_referenceeAccess().getEqualsSignKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getColonne_referenceeAccess().getEqualsSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_referencee__Group__7__Impl"


    // $ANTLR start "rule__Colonne_referencee__Group__8"
    // InternalGs1.g:1396:1: rule__Colonne_referencee__Group__8 : rule__Colonne_referencee__Group__8__Impl rule__Colonne_referencee__Group__9 ;
    public final void rule__Colonne_referencee__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1400:1: ( rule__Colonne_referencee__Group__8__Impl rule__Colonne_referencee__Group__9 )
            // InternalGs1.g:1401:2: rule__Colonne_referencee__Group__8__Impl rule__Colonne_referencee__Group__9
            {
            pushFollow(FOLLOW_18);
            rule__Colonne_referencee__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonne_referencee__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_referencee__Group__8"


    // $ANTLR start "rule__Colonne_referencee__Group__8__Impl"
    // InternalGs1.g:1408:1: rule__Colonne_referencee__Group__8__Impl : ( ( rule__Colonne_referencee__NomAssignment_8 ) ) ;
    public final void rule__Colonne_referencee__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1412:1: ( ( ( rule__Colonne_referencee__NomAssignment_8 ) ) )
            // InternalGs1.g:1413:1: ( ( rule__Colonne_referencee__NomAssignment_8 ) )
            {
            // InternalGs1.g:1413:1: ( ( rule__Colonne_referencee__NomAssignment_8 ) )
            // InternalGs1.g:1414:2: ( rule__Colonne_referencee__NomAssignment_8 )
            {
             before(grammarAccess.getColonne_referenceeAccess().getNomAssignment_8()); 
            // InternalGs1.g:1415:2: ( rule__Colonne_referencee__NomAssignment_8 )
            // InternalGs1.g:1415:3: rule__Colonne_referencee__NomAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Colonne_referencee__NomAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getColonne_referenceeAccess().getNomAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_referencee__Group__8__Impl"


    // $ANTLR start "rule__Colonne_referencee__Group__9"
    // InternalGs1.g:1423:1: rule__Colonne_referencee__Group__9 : rule__Colonne_referencee__Group__9__Impl rule__Colonne_referencee__Group__10 ;
    public final void rule__Colonne_referencee__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1427:1: ( rule__Colonne_referencee__Group__9__Impl rule__Colonne_referencee__Group__10 )
            // InternalGs1.g:1428:2: rule__Colonne_referencee__Group__9__Impl rule__Colonne_referencee__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__Colonne_referencee__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonne_referencee__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_referencee__Group__9"


    // $ANTLR start "rule__Colonne_referencee__Group__9__Impl"
    // InternalGs1.g:1435:1: rule__Colonne_referencee__Group__9__Impl : ( 'table' ) ;
    public final void rule__Colonne_referencee__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1439:1: ( ( 'table' ) )
            // InternalGs1.g:1440:1: ( 'table' )
            {
            // InternalGs1.g:1440:1: ( 'table' )
            // InternalGs1.g:1441:2: 'table'
            {
             before(grammarAccess.getColonne_referenceeAccess().getTableKeyword_9()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getColonne_referenceeAccess().getTableKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_referencee__Group__9__Impl"


    // $ANTLR start "rule__Colonne_referencee__Group__10"
    // InternalGs1.g:1450:1: rule__Colonne_referencee__Group__10 : rule__Colonne_referencee__Group__10__Impl rule__Colonne_referencee__Group__11 ;
    public final void rule__Colonne_referencee__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1454:1: ( rule__Colonne_referencee__Group__10__Impl rule__Colonne_referencee__Group__11 )
            // InternalGs1.g:1455:2: rule__Colonne_referencee__Group__10__Impl rule__Colonne_referencee__Group__11
            {
            pushFollow(FOLLOW_7);
            rule__Colonne_referencee__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonne_referencee__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_referencee__Group__10"


    // $ANTLR start "rule__Colonne_referencee__Group__10__Impl"
    // InternalGs1.g:1462:1: rule__Colonne_referencee__Group__10__Impl : ( '=' ) ;
    public final void rule__Colonne_referencee__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1466:1: ( ( '=' ) )
            // InternalGs1.g:1467:1: ( '=' )
            {
            // InternalGs1.g:1467:1: ( '=' )
            // InternalGs1.g:1468:2: '='
            {
             before(grammarAccess.getColonne_referenceeAccess().getEqualsSignKeyword_10()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getColonne_referenceeAccess().getEqualsSignKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_referencee__Group__10__Impl"


    // $ANTLR start "rule__Colonne_referencee__Group__11"
    // InternalGs1.g:1477:1: rule__Colonne_referencee__Group__11 : rule__Colonne_referencee__Group__11__Impl rule__Colonne_referencee__Group__12 ;
    public final void rule__Colonne_referencee__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1481:1: ( rule__Colonne_referencee__Group__11__Impl rule__Colonne_referencee__Group__12 )
            // InternalGs1.g:1482:2: rule__Colonne_referencee__Group__11__Impl rule__Colonne_referencee__Group__12
            {
            pushFollow(FOLLOW_19);
            rule__Colonne_referencee__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonne_referencee__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_referencee__Group__11"


    // $ANTLR start "rule__Colonne_referencee__Group__11__Impl"
    // InternalGs1.g:1489:1: rule__Colonne_referencee__Group__11__Impl : ( ( rule__Colonne_referencee__TableAssignment_11 ) ) ;
    public final void rule__Colonne_referencee__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1493:1: ( ( ( rule__Colonne_referencee__TableAssignment_11 ) ) )
            // InternalGs1.g:1494:1: ( ( rule__Colonne_referencee__TableAssignment_11 ) )
            {
            // InternalGs1.g:1494:1: ( ( rule__Colonne_referencee__TableAssignment_11 ) )
            // InternalGs1.g:1495:2: ( rule__Colonne_referencee__TableAssignment_11 )
            {
             before(grammarAccess.getColonne_referenceeAccess().getTableAssignment_11()); 
            // InternalGs1.g:1496:2: ( rule__Colonne_referencee__TableAssignment_11 )
            // InternalGs1.g:1496:3: rule__Colonne_referencee__TableAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Colonne_referencee__TableAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getColonne_referenceeAccess().getTableAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_referencee__Group__11__Impl"


    // $ANTLR start "rule__Colonne_referencee__Group__12"
    // InternalGs1.g:1504:1: rule__Colonne_referencee__Group__12 : rule__Colonne_referencee__Group__12__Impl rule__Colonne_referencee__Group__13 ;
    public final void rule__Colonne_referencee__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1508:1: ( rule__Colonne_referencee__Group__12__Impl rule__Colonne_referencee__Group__13 )
            // InternalGs1.g:1509:2: rule__Colonne_referencee__Group__12__Impl rule__Colonne_referencee__Group__13
            {
            pushFollow(FOLLOW_9);
            rule__Colonne_referencee__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonne_referencee__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_referencee__Group__12"


    // $ANTLR start "rule__Colonne_referencee__Group__12__Impl"
    // InternalGs1.g:1516:1: rule__Colonne_referencee__Group__12__Impl : ( 'colonne' ) ;
    public final void rule__Colonne_referencee__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1520:1: ( ( 'colonne' ) )
            // InternalGs1.g:1521:1: ( 'colonne' )
            {
            // InternalGs1.g:1521:1: ( 'colonne' )
            // InternalGs1.g:1522:2: 'colonne'
            {
             before(grammarAccess.getColonne_referenceeAccess().getColonneKeyword_12()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getColonne_referenceeAccess().getColonneKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_referencee__Group__12__Impl"


    // $ANTLR start "rule__Colonne_referencee__Group__13"
    // InternalGs1.g:1531:1: rule__Colonne_referencee__Group__13 : rule__Colonne_referencee__Group__13__Impl rule__Colonne_referencee__Group__14 ;
    public final void rule__Colonne_referencee__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1535:1: ( rule__Colonne_referencee__Group__13__Impl rule__Colonne_referencee__Group__14 )
            // InternalGs1.g:1536:2: rule__Colonne_referencee__Group__13__Impl rule__Colonne_referencee__Group__14
            {
            pushFollow(FOLLOW_7);
            rule__Colonne_referencee__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonne_referencee__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_referencee__Group__13"


    // $ANTLR start "rule__Colonne_referencee__Group__13__Impl"
    // InternalGs1.g:1543:1: rule__Colonne_referencee__Group__13__Impl : ( '=' ) ;
    public final void rule__Colonne_referencee__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1547:1: ( ( '=' ) )
            // InternalGs1.g:1548:1: ( '=' )
            {
            // InternalGs1.g:1548:1: ( '=' )
            // InternalGs1.g:1549:2: '='
            {
             before(grammarAccess.getColonne_referenceeAccess().getEqualsSignKeyword_13()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getColonne_referenceeAccess().getEqualsSignKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_referencee__Group__13__Impl"


    // $ANTLR start "rule__Colonne_referencee__Group__14"
    // InternalGs1.g:1558:1: rule__Colonne_referencee__Group__14 : rule__Colonne_referencee__Group__14__Impl rule__Colonne_referencee__Group__15 ;
    public final void rule__Colonne_referencee__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1562:1: ( rule__Colonne_referencee__Group__14__Impl rule__Colonne_referencee__Group__15 )
            // InternalGs1.g:1563:2: rule__Colonne_referencee__Group__14__Impl rule__Colonne_referencee__Group__15
            {
            pushFollow(FOLLOW_17);
            rule__Colonne_referencee__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonne_referencee__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_referencee__Group__14"


    // $ANTLR start "rule__Colonne_referencee__Group__14__Impl"
    // InternalGs1.g:1570:1: rule__Colonne_referencee__Group__14__Impl : ( ( rule__Colonne_referencee__ColonneAssignment_14 ) ) ;
    public final void rule__Colonne_referencee__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1574:1: ( ( ( rule__Colonne_referencee__ColonneAssignment_14 ) ) )
            // InternalGs1.g:1575:1: ( ( rule__Colonne_referencee__ColonneAssignment_14 ) )
            {
            // InternalGs1.g:1575:1: ( ( rule__Colonne_referencee__ColonneAssignment_14 ) )
            // InternalGs1.g:1576:2: ( rule__Colonne_referencee__ColonneAssignment_14 )
            {
             before(grammarAccess.getColonne_referenceeAccess().getColonneAssignment_14()); 
            // InternalGs1.g:1577:2: ( rule__Colonne_referencee__ColonneAssignment_14 )
            // InternalGs1.g:1577:3: rule__Colonne_referencee__ColonneAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Colonne_referencee__ColonneAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getColonne_referenceeAccess().getColonneAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_referencee__Group__14__Impl"


    // $ANTLR start "rule__Colonne_referencee__Group__15"
    // InternalGs1.g:1585:1: rule__Colonne_referencee__Group__15 : rule__Colonne_referencee__Group__15__Impl ;
    public final void rule__Colonne_referencee__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1589:1: ( rule__Colonne_referencee__Group__15__Impl )
            // InternalGs1.g:1590:2: rule__Colonne_referencee__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Colonne_referencee__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_referencee__Group__15"


    // $ANTLR start "rule__Colonne_referencee__Group__15__Impl"
    // InternalGs1.g:1596:1: rule__Colonne_referencee__Group__15__Impl : ( '}' ) ;
    public final void rule__Colonne_referencee__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1600:1: ( ( '}' ) )
            // InternalGs1.g:1601:1: ( '}' )
            {
            // InternalGs1.g:1601:1: ( '}' )
            // InternalGs1.g:1602:2: '}'
            {
             before(grammarAccess.getColonne_referenceeAccess().getRightCurlyBracketKeyword_15()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getColonne_referenceeAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_referencee__Group__15__Impl"


    // $ANTLR start "rule__Colonnesimple__Group__0"
    // InternalGs1.g:1612:1: rule__Colonnesimple__Group__0 : rule__Colonnesimple__Group__0__Impl rule__Colonnesimple__Group__1 ;
    public final void rule__Colonnesimple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1616:1: ( rule__Colonnesimple__Group__0__Impl rule__Colonnesimple__Group__1 )
            // InternalGs1.g:1617:2: rule__Colonnesimple__Group__0__Impl rule__Colonnesimple__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Colonnesimple__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonnesimple__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonnesimple__Group__0"


    // $ANTLR start "rule__Colonnesimple__Group__0__Impl"
    // InternalGs1.g:1624:1: rule__Colonnesimple__Group__0__Impl : ( 'Colonnesimple' ) ;
    public final void rule__Colonnesimple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1628:1: ( ( 'Colonnesimple' ) )
            // InternalGs1.g:1629:1: ( 'Colonnesimple' )
            {
            // InternalGs1.g:1629:1: ( 'Colonnesimple' )
            // InternalGs1.g:1630:2: 'Colonnesimple'
            {
             before(grammarAccess.getColonnesimpleAccess().getColonnesimpleKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getColonnesimpleAccess().getColonnesimpleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonnesimple__Group__0__Impl"


    // $ANTLR start "rule__Colonnesimple__Group__1"
    // InternalGs1.g:1639:1: rule__Colonnesimple__Group__1 : rule__Colonnesimple__Group__1__Impl rule__Colonnesimple__Group__2 ;
    public final void rule__Colonnesimple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1643:1: ( rule__Colonnesimple__Group__1__Impl rule__Colonnesimple__Group__2 )
            // InternalGs1.g:1644:2: rule__Colonnesimple__Group__1__Impl rule__Colonnesimple__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Colonnesimple__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonnesimple__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonnesimple__Group__1"


    // $ANTLR start "rule__Colonnesimple__Group__1__Impl"
    // InternalGs1.g:1651:1: rule__Colonnesimple__Group__1__Impl : ( ( rule__Colonnesimple__NameAssignment_1 ) ) ;
    public final void rule__Colonnesimple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1655:1: ( ( ( rule__Colonnesimple__NameAssignment_1 ) ) )
            // InternalGs1.g:1656:1: ( ( rule__Colonnesimple__NameAssignment_1 ) )
            {
            // InternalGs1.g:1656:1: ( ( rule__Colonnesimple__NameAssignment_1 ) )
            // InternalGs1.g:1657:2: ( rule__Colonnesimple__NameAssignment_1 )
            {
             before(grammarAccess.getColonnesimpleAccess().getNameAssignment_1()); 
            // InternalGs1.g:1658:2: ( rule__Colonnesimple__NameAssignment_1 )
            // InternalGs1.g:1658:3: rule__Colonnesimple__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Colonnesimple__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getColonnesimpleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonnesimple__Group__1__Impl"


    // $ANTLR start "rule__Colonnesimple__Group__2"
    // InternalGs1.g:1666:1: rule__Colonnesimple__Group__2 : rule__Colonnesimple__Group__2__Impl rule__Colonnesimple__Group__3 ;
    public final void rule__Colonnesimple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1670:1: ( rule__Colonnesimple__Group__2__Impl rule__Colonnesimple__Group__3 )
            // InternalGs1.g:1671:2: rule__Colonnesimple__Group__2__Impl rule__Colonnesimple__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Colonnesimple__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonnesimple__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonnesimple__Group__2"


    // $ANTLR start "rule__Colonnesimple__Group__2__Impl"
    // InternalGs1.g:1678:1: rule__Colonnesimple__Group__2__Impl : ( '{' ) ;
    public final void rule__Colonnesimple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1682:1: ( ( '{' ) )
            // InternalGs1.g:1683:1: ( '{' )
            {
            // InternalGs1.g:1683:1: ( '{' )
            // InternalGs1.g:1684:2: '{'
            {
             before(grammarAccess.getColonnesimpleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getColonnesimpleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonnesimple__Group__2__Impl"


    // $ANTLR start "rule__Colonnesimple__Group__3"
    // InternalGs1.g:1693:1: rule__Colonnesimple__Group__3 : rule__Colonnesimple__Group__3__Impl rule__Colonnesimple__Group__4 ;
    public final void rule__Colonnesimple__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1697:1: ( rule__Colonnesimple__Group__3__Impl rule__Colonnesimple__Group__4 )
            // InternalGs1.g:1698:2: rule__Colonnesimple__Group__3__Impl rule__Colonnesimple__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Colonnesimple__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonnesimple__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonnesimple__Group__3"


    // $ANTLR start "rule__Colonnesimple__Group__3__Impl"
    // InternalGs1.g:1705:1: rule__Colonnesimple__Group__3__Impl : ( 'id' ) ;
    public final void rule__Colonnesimple__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1709:1: ( ( 'id' ) )
            // InternalGs1.g:1710:1: ( 'id' )
            {
            // InternalGs1.g:1710:1: ( 'id' )
            // InternalGs1.g:1711:2: 'id'
            {
             before(grammarAccess.getColonnesimpleAccess().getIdKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getColonnesimpleAccess().getIdKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonnesimple__Group__3__Impl"


    // $ANTLR start "rule__Colonnesimple__Group__4"
    // InternalGs1.g:1720:1: rule__Colonnesimple__Group__4 : rule__Colonnesimple__Group__4__Impl rule__Colonnesimple__Group__5 ;
    public final void rule__Colonnesimple__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1724:1: ( rule__Colonnesimple__Group__4__Impl rule__Colonnesimple__Group__5 )
            // InternalGs1.g:1725:2: rule__Colonnesimple__Group__4__Impl rule__Colonnesimple__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Colonnesimple__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonnesimple__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonnesimple__Group__4"


    // $ANTLR start "rule__Colonnesimple__Group__4__Impl"
    // InternalGs1.g:1732:1: rule__Colonnesimple__Group__4__Impl : ( '=' ) ;
    public final void rule__Colonnesimple__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1736:1: ( ( '=' ) )
            // InternalGs1.g:1737:1: ( '=' )
            {
            // InternalGs1.g:1737:1: ( '=' )
            // InternalGs1.g:1738:2: '='
            {
             before(grammarAccess.getColonnesimpleAccess().getEqualsSignKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getColonnesimpleAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonnesimple__Group__4__Impl"


    // $ANTLR start "rule__Colonnesimple__Group__5"
    // InternalGs1.g:1747:1: rule__Colonnesimple__Group__5 : rule__Colonnesimple__Group__5__Impl rule__Colonnesimple__Group__6 ;
    public final void rule__Colonnesimple__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1751:1: ( rule__Colonnesimple__Group__5__Impl rule__Colonnesimple__Group__6 )
            // InternalGs1.g:1752:2: rule__Colonnesimple__Group__5__Impl rule__Colonnesimple__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Colonnesimple__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonnesimple__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonnesimple__Group__5"


    // $ANTLR start "rule__Colonnesimple__Group__5__Impl"
    // InternalGs1.g:1759:1: rule__Colonnesimple__Group__5__Impl : ( ( rule__Colonnesimple__IdAssignment_5 ) ) ;
    public final void rule__Colonnesimple__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1763:1: ( ( ( rule__Colonnesimple__IdAssignment_5 ) ) )
            // InternalGs1.g:1764:1: ( ( rule__Colonnesimple__IdAssignment_5 ) )
            {
            // InternalGs1.g:1764:1: ( ( rule__Colonnesimple__IdAssignment_5 ) )
            // InternalGs1.g:1765:2: ( rule__Colonnesimple__IdAssignment_5 )
            {
             before(grammarAccess.getColonnesimpleAccess().getIdAssignment_5()); 
            // InternalGs1.g:1766:2: ( rule__Colonnesimple__IdAssignment_5 )
            // InternalGs1.g:1766:3: rule__Colonnesimple__IdAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Colonnesimple__IdAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getColonnesimpleAccess().getIdAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonnesimple__Group__5__Impl"


    // $ANTLR start "rule__Colonnesimple__Group__6"
    // InternalGs1.g:1774:1: rule__Colonnesimple__Group__6 : rule__Colonnesimple__Group__6__Impl rule__Colonnesimple__Group__7 ;
    public final void rule__Colonnesimple__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1778:1: ( rule__Colonnesimple__Group__6__Impl rule__Colonnesimple__Group__7 )
            // InternalGs1.g:1779:2: rule__Colonnesimple__Group__6__Impl rule__Colonnesimple__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Colonnesimple__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonnesimple__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonnesimple__Group__6"


    // $ANTLR start "rule__Colonnesimple__Group__6__Impl"
    // InternalGs1.g:1786:1: rule__Colonnesimple__Group__6__Impl : ( 'Nom' ) ;
    public final void rule__Colonnesimple__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1790:1: ( ( 'Nom' ) )
            // InternalGs1.g:1791:1: ( 'Nom' )
            {
            // InternalGs1.g:1791:1: ( 'Nom' )
            // InternalGs1.g:1792:2: 'Nom'
            {
             before(grammarAccess.getColonnesimpleAccess().getNomKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getColonnesimpleAccess().getNomKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonnesimple__Group__6__Impl"


    // $ANTLR start "rule__Colonnesimple__Group__7"
    // InternalGs1.g:1801:1: rule__Colonnesimple__Group__7 : rule__Colonnesimple__Group__7__Impl rule__Colonnesimple__Group__8 ;
    public final void rule__Colonnesimple__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1805:1: ( rule__Colonnesimple__Group__7__Impl rule__Colonnesimple__Group__8 )
            // InternalGs1.g:1806:2: rule__Colonnesimple__Group__7__Impl rule__Colonnesimple__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__Colonnesimple__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonnesimple__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonnesimple__Group__7"


    // $ANTLR start "rule__Colonnesimple__Group__7__Impl"
    // InternalGs1.g:1813:1: rule__Colonnesimple__Group__7__Impl : ( '=' ) ;
    public final void rule__Colonnesimple__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1817:1: ( ( '=' ) )
            // InternalGs1.g:1818:1: ( '=' )
            {
            // InternalGs1.g:1818:1: ( '=' )
            // InternalGs1.g:1819:2: '='
            {
             before(grammarAccess.getColonnesimpleAccess().getEqualsSignKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getColonnesimpleAccess().getEqualsSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonnesimple__Group__7__Impl"


    // $ANTLR start "rule__Colonnesimple__Group__8"
    // InternalGs1.g:1828:1: rule__Colonnesimple__Group__8 : rule__Colonnesimple__Group__8__Impl rule__Colonnesimple__Group__9 ;
    public final void rule__Colonnesimple__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1832:1: ( rule__Colonnesimple__Group__8__Impl rule__Colonnesimple__Group__9 )
            // InternalGs1.g:1833:2: rule__Colonnesimple__Group__8__Impl rule__Colonnesimple__Group__9
            {
            pushFollow(FOLLOW_17);
            rule__Colonnesimple__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonnesimple__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonnesimple__Group__8"


    // $ANTLR start "rule__Colonnesimple__Group__8__Impl"
    // InternalGs1.g:1840:1: rule__Colonnesimple__Group__8__Impl : ( ( rule__Colonnesimple__NomAssignment_8 ) ) ;
    public final void rule__Colonnesimple__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1844:1: ( ( ( rule__Colonnesimple__NomAssignment_8 ) ) )
            // InternalGs1.g:1845:1: ( ( rule__Colonnesimple__NomAssignment_8 ) )
            {
            // InternalGs1.g:1845:1: ( ( rule__Colonnesimple__NomAssignment_8 ) )
            // InternalGs1.g:1846:2: ( rule__Colonnesimple__NomAssignment_8 )
            {
             before(grammarAccess.getColonnesimpleAccess().getNomAssignment_8()); 
            // InternalGs1.g:1847:2: ( rule__Colonnesimple__NomAssignment_8 )
            // InternalGs1.g:1847:3: rule__Colonnesimple__NomAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Colonnesimple__NomAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getColonnesimpleAccess().getNomAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonnesimple__Group__8__Impl"


    // $ANTLR start "rule__Colonnesimple__Group__9"
    // InternalGs1.g:1855:1: rule__Colonnesimple__Group__9 : rule__Colonnesimple__Group__9__Impl ;
    public final void rule__Colonnesimple__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1859:1: ( rule__Colonnesimple__Group__9__Impl )
            // InternalGs1.g:1860:2: rule__Colonnesimple__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Colonnesimple__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonnesimple__Group__9"


    // $ANTLR start "rule__Colonnesimple__Group__9__Impl"
    // InternalGs1.g:1866:1: rule__Colonnesimple__Group__9__Impl : ( '}' ) ;
    public final void rule__Colonnesimple__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1870:1: ( ( '}' ) )
            // InternalGs1.g:1871:1: ( '}' )
            {
            // InternalGs1.g:1871:1: ( '}' )
            // InternalGs1.g:1872:2: '}'
            {
             before(grammarAccess.getColonnesimpleAccess().getRightCurlyBracketKeyword_9()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getColonnesimpleAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonnesimple__Group__9__Impl"


    // $ANTLR start "rule__ExpressionBinaire__Group__0"
    // InternalGs1.g:1882:1: rule__ExpressionBinaire__Group__0 : rule__ExpressionBinaire__Group__0__Impl rule__ExpressionBinaire__Group__1 ;
    public final void rule__ExpressionBinaire__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1886:1: ( rule__ExpressionBinaire__Group__0__Impl rule__ExpressionBinaire__Group__1 )
            // InternalGs1.g:1887:2: rule__ExpressionBinaire__Group__0__Impl rule__ExpressionBinaire__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ExpressionBinaire__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionBinaire__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBinaire__Group__0"


    // $ANTLR start "rule__ExpressionBinaire__Group__0__Impl"
    // InternalGs1.g:1894:1: rule__ExpressionBinaire__Group__0__Impl : ( 'ExpressionBinaire' ) ;
    public final void rule__ExpressionBinaire__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1898:1: ( ( 'ExpressionBinaire' ) )
            // InternalGs1.g:1899:1: ( 'ExpressionBinaire' )
            {
            // InternalGs1.g:1899:1: ( 'ExpressionBinaire' )
            // InternalGs1.g:1900:2: 'ExpressionBinaire'
            {
             before(grammarAccess.getExpressionBinaireAccess().getExpressionBinaireKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getExpressionBinaireAccess().getExpressionBinaireKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBinaire__Group__0__Impl"


    // $ANTLR start "rule__ExpressionBinaire__Group__1"
    // InternalGs1.g:1909:1: rule__ExpressionBinaire__Group__1 : rule__ExpressionBinaire__Group__1__Impl rule__ExpressionBinaire__Group__2 ;
    public final void rule__ExpressionBinaire__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1913:1: ( rule__ExpressionBinaire__Group__1__Impl rule__ExpressionBinaire__Group__2 )
            // InternalGs1.g:1914:2: rule__ExpressionBinaire__Group__1__Impl rule__ExpressionBinaire__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ExpressionBinaire__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionBinaire__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBinaire__Group__1"


    // $ANTLR start "rule__ExpressionBinaire__Group__1__Impl"
    // InternalGs1.g:1921:1: rule__ExpressionBinaire__Group__1__Impl : ( ( rule__ExpressionBinaire__NameAssignment_1 ) ) ;
    public final void rule__ExpressionBinaire__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1925:1: ( ( ( rule__ExpressionBinaire__NameAssignment_1 ) ) )
            // InternalGs1.g:1926:1: ( ( rule__ExpressionBinaire__NameAssignment_1 ) )
            {
            // InternalGs1.g:1926:1: ( ( rule__ExpressionBinaire__NameAssignment_1 ) )
            // InternalGs1.g:1927:2: ( rule__ExpressionBinaire__NameAssignment_1 )
            {
             before(grammarAccess.getExpressionBinaireAccess().getNameAssignment_1()); 
            // InternalGs1.g:1928:2: ( rule__ExpressionBinaire__NameAssignment_1 )
            // InternalGs1.g:1928:3: rule__ExpressionBinaire__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBinaire__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionBinaireAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBinaire__Group__1__Impl"


    // $ANTLR start "rule__ExpressionBinaire__Group__2"
    // InternalGs1.g:1936:1: rule__ExpressionBinaire__Group__2 : rule__ExpressionBinaire__Group__2__Impl rule__ExpressionBinaire__Group__3 ;
    public final void rule__ExpressionBinaire__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1940:1: ( rule__ExpressionBinaire__Group__2__Impl rule__ExpressionBinaire__Group__3 )
            // InternalGs1.g:1941:2: rule__ExpressionBinaire__Group__2__Impl rule__ExpressionBinaire__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__ExpressionBinaire__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionBinaire__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBinaire__Group__2"


    // $ANTLR start "rule__ExpressionBinaire__Group__2__Impl"
    // InternalGs1.g:1948:1: rule__ExpressionBinaire__Group__2__Impl : ( '{' ) ;
    public final void rule__ExpressionBinaire__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1952:1: ( ( '{' ) )
            // InternalGs1.g:1953:1: ( '{' )
            {
            // InternalGs1.g:1953:1: ( '{' )
            // InternalGs1.g:1954:2: '{'
            {
             before(grammarAccess.getExpressionBinaireAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getExpressionBinaireAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBinaire__Group__2__Impl"


    // $ANTLR start "rule__ExpressionBinaire__Group__3"
    // InternalGs1.g:1963:1: rule__ExpressionBinaire__Group__3 : rule__ExpressionBinaire__Group__3__Impl rule__ExpressionBinaire__Group__4 ;
    public final void rule__ExpressionBinaire__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1967:1: ( rule__ExpressionBinaire__Group__3__Impl rule__ExpressionBinaire__Group__4 )
            // InternalGs1.g:1968:2: rule__ExpressionBinaire__Group__3__Impl rule__ExpressionBinaire__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__ExpressionBinaire__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionBinaire__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBinaire__Group__3"


    // $ANTLR start "rule__ExpressionBinaire__Group__3__Impl"
    // InternalGs1.g:1975:1: rule__ExpressionBinaire__Group__3__Impl : ( 'operandeG' ) ;
    public final void rule__ExpressionBinaire__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1979:1: ( ( 'operandeG' ) )
            // InternalGs1.g:1980:1: ( 'operandeG' )
            {
            // InternalGs1.g:1980:1: ( 'operandeG' )
            // InternalGs1.g:1981:2: 'operandeG'
            {
             before(grammarAccess.getExpressionBinaireAccess().getOperandeGKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getExpressionBinaireAccess().getOperandeGKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBinaire__Group__3__Impl"


    // $ANTLR start "rule__ExpressionBinaire__Group__4"
    // InternalGs1.g:1990:1: rule__ExpressionBinaire__Group__4 : rule__ExpressionBinaire__Group__4__Impl rule__ExpressionBinaire__Group__5 ;
    public final void rule__ExpressionBinaire__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:1994:1: ( rule__ExpressionBinaire__Group__4__Impl rule__ExpressionBinaire__Group__5 )
            // InternalGs1.g:1995:2: rule__ExpressionBinaire__Group__4__Impl rule__ExpressionBinaire__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__ExpressionBinaire__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionBinaire__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBinaire__Group__4"


    // $ANTLR start "rule__ExpressionBinaire__Group__4__Impl"
    // InternalGs1.g:2002:1: rule__ExpressionBinaire__Group__4__Impl : ( '=' ) ;
    public final void rule__ExpressionBinaire__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2006:1: ( ( '=' ) )
            // InternalGs1.g:2007:1: ( '=' )
            {
            // InternalGs1.g:2007:1: ( '=' )
            // InternalGs1.g:2008:2: '='
            {
             before(grammarAccess.getExpressionBinaireAccess().getEqualsSignKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getExpressionBinaireAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBinaire__Group__4__Impl"


    // $ANTLR start "rule__ExpressionBinaire__Group__5"
    // InternalGs1.g:2017:1: rule__ExpressionBinaire__Group__5 : rule__ExpressionBinaire__Group__5__Impl rule__ExpressionBinaire__Group__6 ;
    public final void rule__ExpressionBinaire__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2021:1: ( rule__ExpressionBinaire__Group__5__Impl rule__ExpressionBinaire__Group__6 )
            // InternalGs1.g:2022:2: rule__ExpressionBinaire__Group__5__Impl rule__ExpressionBinaire__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__ExpressionBinaire__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionBinaire__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBinaire__Group__5"


    // $ANTLR start "rule__ExpressionBinaire__Group__5__Impl"
    // InternalGs1.g:2029:1: rule__ExpressionBinaire__Group__5__Impl : ( ( rule__ExpressionBinaire__OperandeGAssignment_5 ) ) ;
    public final void rule__ExpressionBinaire__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2033:1: ( ( ( rule__ExpressionBinaire__OperandeGAssignment_5 ) ) )
            // InternalGs1.g:2034:1: ( ( rule__ExpressionBinaire__OperandeGAssignment_5 ) )
            {
            // InternalGs1.g:2034:1: ( ( rule__ExpressionBinaire__OperandeGAssignment_5 ) )
            // InternalGs1.g:2035:2: ( rule__ExpressionBinaire__OperandeGAssignment_5 )
            {
             before(grammarAccess.getExpressionBinaireAccess().getOperandeGAssignment_5()); 
            // InternalGs1.g:2036:2: ( rule__ExpressionBinaire__OperandeGAssignment_5 )
            // InternalGs1.g:2036:3: rule__ExpressionBinaire__OperandeGAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBinaire__OperandeGAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getExpressionBinaireAccess().getOperandeGAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBinaire__Group__5__Impl"


    // $ANTLR start "rule__ExpressionBinaire__Group__6"
    // InternalGs1.g:2044:1: rule__ExpressionBinaire__Group__6 : rule__ExpressionBinaire__Group__6__Impl rule__ExpressionBinaire__Group__7 ;
    public final void rule__ExpressionBinaire__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2048:1: ( rule__ExpressionBinaire__Group__6__Impl rule__ExpressionBinaire__Group__7 )
            // InternalGs1.g:2049:2: rule__ExpressionBinaire__Group__6__Impl rule__ExpressionBinaire__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__ExpressionBinaire__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionBinaire__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBinaire__Group__6"


    // $ANTLR start "rule__ExpressionBinaire__Group__6__Impl"
    // InternalGs1.g:2056:1: rule__ExpressionBinaire__Group__6__Impl : ( 'operateur' ) ;
    public final void rule__ExpressionBinaire__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2060:1: ( ( 'operateur' ) )
            // InternalGs1.g:2061:1: ( 'operateur' )
            {
            // InternalGs1.g:2061:1: ( 'operateur' )
            // InternalGs1.g:2062:2: 'operateur'
            {
             before(grammarAccess.getExpressionBinaireAccess().getOperateurKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getExpressionBinaireAccess().getOperateurKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBinaire__Group__6__Impl"


    // $ANTLR start "rule__ExpressionBinaire__Group__7"
    // InternalGs1.g:2071:1: rule__ExpressionBinaire__Group__7 : rule__ExpressionBinaire__Group__7__Impl rule__ExpressionBinaire__Group__8 ;
    public final void rule__ExpressionBinaire__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2075:1: ( rule__ExpressionBinaire__Group__7__Impl rule__ExpressionBinaire__Group__8 )
            // InternalGs1.g:2076:2: rule__ExpressionBinaire__Group__7__Impl rule__ExpressionBinaire__Group__8
            {
            pushFollow(FOLLOW_22);
            rule__ExpressionBinaire__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionBinaire__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBinaire__Group__7"


    // $ANTLR start "rule__ExpressionBinaire__Group__7__Impl"
    // InternalGs1.g:2083:1: rule__ExpressionBinaire__Group__7__Impl : ( '=' ) ;
    public final void rule__ExpressionBinaire__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2087:1: ( ( '=' ) )
            // InternalGs1.g:2088:1: ( '=' )
            {
            // InternalGs1.g:2088:1: ( '=' )
            // InternalGs1.g:2089:2: '='
            {
             before(grammarAccess.getExpressionBinaireAccess().getEqualsSignKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getExpressionBinaireAccess().getEqualsSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBinaire__Group__7__Impl"


    // $ANTLR start "rule__ExpressionBinaire__Group__8"
    // InternalGs1.g:2098:1: rule__ExpressionBinaire__Group__8 : rule__ExpressionBinaire__Group__8__Impl rule__ExpressionBinaire__Group__9 ;
    public final void rule__ExpressionBinaire__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2102:1: ( rule__ExpressionBinaire__Group__8__Impl rule__ExpressionBinaire__Group__9 )
            // InternalGs1.g:2103:2: rule__ExpressionBinaire__Group__8__Impl rule__ExpressionBinaire__Group__9
            {
            pushFollow(FOLLOW_23);
            rule__ExpressionBinaire__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionBinaire__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBinaire__Group__8"


    // $ANTLR start "rule__ExpressionBinaire__Group__8__Impl"
    // InternalGs1.g:2110:1: rule__ExpressionBinaire__Group__8__Impl : ( ( rule__ExpressionBinaire__OperateurAssignment_8 ) ) ;
    public final void rule__ExpressionBinaire__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2114:1: ( ( ( rule__ExpressionBinaire__OperateurAssignment_8 ) ) )
            // InternalGs1.g:2115:1: ( ( rule__ExpressionBinaire__OperateurAssignment_8 ) )
            {
            // InternalGs1.g:2115:1: ( ( rule__ExpressionBinaire__OperateurAssignment_8 ) )
            // InternalGs1.g:2116:2: ( rule__ExpressionBinaire__OperateurAssignment_8 )
            {
             before(grammarAccess.getExpressionBinaireAccess().getOperateurAssignment_8()); 
            // InternalGs1.g:2117:2: ( rule__ExpressionBinaire__OperateurAssignment_8 )
            // InternalGs1.g:2117:3: rule__ExpressionBinaire__OperateurAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBinaire__OperateurAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getExpressionBinaireAccess().getOperateurAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBinaire__Group__8__Impl"


    // $ANTLR start "rule__ExpressionBinaire__Group__9"
    // InternalGs1.g:2125:1: rule__ExpressionBinaire__Group__9 : rule__ExpressionBinaire__Group__9__Impl rule__ExpressionBinaire__Group__10 ;
    public final void rule__ExpressionBinaire__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2129:1: ( rule__ExpressionBinaire__Group__9__Impl rule__ExpressionBinaire__Group__10 )
            // InternalGs1.g:2130:2: rule__ExpressionBinaire__Group__9__Impl rule__ExpressionBinaire__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__ExpressionBinaire__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionBinaire__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBinaire__Group__9"


    // $ANTLR start "rule__ExpressionBinaire__Group__9__Impl"
    // InternalGs1.g:2137:1: rule__ExpressionBinaire__Group__9__Impl : ( 'operandeD' ) ;
    public final void rule__ExpressionBinaire__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2141:1: ( ( 'operandeD' ) )
            // InternalGs1.g:2142:1: ( 'operandeD' )
            {
            // InternalGs1.g:2142:1: ( 'operandeD' )
            // InternalGs1.g:2143:2: 'operandeD'
            {
             before(grammarAccess.getExpressionBinaireAccess().getOperandeDKeyword_9()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getExpressionBinaireAccess().getOperandeDKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBinaire__Group__9__Impl"


    // $ANTLR start "rule__ExpressionBinaire__Group__10"
    // InternalGs1.g:2152:1: rule__ExpressionBinaire__Group__10 : rule__ExpressionBinaire__Group__10__Impl rule__ExpressionBinaire__Group__11 ;
    public final void rule__ExpressionBinaire__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2156:1: ( rule__ExpressionBinaire__Group__10__Impl rule__ExpressionBinaire__Group__11 )
            // InternalGs1.g:2157:2: rule__ExpressionBinaire__Group__10__Impl rule__ExpressionBinaire__Group__11
            {
            pushFollow(FOLLOW_16);
            rule__ExpressionBinaire__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionBinaire__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBinaire__Group__10"


    // $ANTLR start "rule__ExpressionBinaire__Group__10__Impl"
    // InternalGs1.g:2164:1: rule__ExpressionBinaire__Group__10__Impl : ( '=' ) ;
    public final void rule__ExpressionBinaire__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2168:1: ( ( '=' ) )
            // InternalGs1.g:2169:1: ( '=' )
            {
            // InternalGs1.g:2169:1: ( '=' )
            // InternalGs1.g:2170:2: '='
            {
             before(grammarAccess.getExpressionBinaireAccess().getEqualsSignKeyword_10()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getExpressionBinaireAccess().getEqualsSignKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBinaire__Group__10__Impl"


    // $ANTLR start "rule__ExpressionBinaire__Group__11"
    // InternalGs1.g:2179:1: rule__ExpressionBinaire__Group__11 : rule__ExpressionBinaire__Group__11__Impl rule__ExpressionBinaire__Group__12 ;
    public final void rule__ExpressionBinaire__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2183:1: ( rule__ExpressionBinaire__Group__11__Impl rule__ExpressionBinaire__Group__12 )
            // InternalGs1.g:2184:2: rule__ExpressionBinaire__Group__11__Impl rule__ExpressionBinaire__Group__12
            {
            pushFollow(FOLLOW_17);
            rule__ExpressionBinaire__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionBinaire__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBinaire__Group__11"


    // $ANTLR start "rule__ExpressionBinaire__Group__11__Impl"
    // InternalGs1.g:2191:1: rule__ExpressionBinaire__Group__11__Impl : ( ( rule__ExpressionBinaire__OperandeDAssignment_11 ) ) ;
    public final void rule__ExpressionBinaire__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2195:1: ( ( ( rule__ExpressionBinaire__OperandeDAssignment_11 ) ) )
            // InternalGs1.g:2196:1: ( ( rule__ExpressionBinaire__OperandeDAssignment_11 ) )
            {
            // InternalGs1.g:2196:1: ( ( rule__ExpressionBinaire__OperandeDAssignment_11 ) )
            // InternalGs1.g:2197:2: ( rule__ExpressionBinaire__OperandeDAssignment_11 )
            {
             before(grammarAccess.getExpressionBinaireAccess().getOperandeDAssignment_11()); 
            // InternalGs1.g:2198:2: ( rule__ExpressionBinaire__OperandeDAssignment_11 )
            // InternalGs1.g:2198:3: rule__ExpressionBinaire__OperandeDAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBinaire__OperandeDAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getExpressionBinaireAccess().getOperandeDAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBinaire__Group__11__Impl"


    // $ANTLR start "rule__ExpressionBinaire__Group__12"
    // InternalGs1.g:2206:1: rule__ExpressionBinaire__Group__12 : rule__ExpressionBinaire__Group__12__Impl ;
    public final void rule__ExpressionBinaire__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2210:1: ( rule__ExpressionBinaire__Group__12__Impl )
            // InternalGs1.g:2211:2: rule__ExpressionBinaire__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBinaire__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBinaire__Group__12"


    // $ANTLR start "rule__ExpressionBinaire__Group__12__Impl"
    // InternalGs1.g:2217:1: rule__ExpressionBinaire__Group__12__Impl : ( '}' ) ;
    public final void rule__ExpressionBinaire__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2221:1: ( ( '}' ) )
            // InternalGs1.g:2222:1: ( '}' )
            {
            // InternalGs1.g:2222:1: ( '}' )
            // InternalGs1.g:2223:2: '}'
            {
             before(grammarAccess.getExpressionBinaireAccess().getRightCurlyBracketKeyword_12()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getExpressionBinaireAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBinaire__Group__12__Impl"


    // $ANTLR start "rule__AccesVariable__Group__0"
    // InternalGs1.g:2233:1: rule__AccesVariable__Group__0 : rule__AccesVariable__Group__0__Impl rule__AccesVariable__Group__1 ;
    public final void rule__AccesVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2237:1: ( rule__AccesVariable__Group__0__Impl rule__AccesVariable__Group__1 )
            // InternalGs1.g:2238:2: rule__AccesVariable__Group__0__Impl rule__AccesVariable__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__AccesVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccesVariable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccesVariable__Group__0"


    // $ANTLR start "rule__AccesVariable__Group__0__Impl"
    // InternalGs1.g:2245:1: rule__AccesVariable__Group__0__Impl : ( 'AccesVariable' ) ;
    public final void rule__AccesVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2249:1: ( ( 'AccesVariable' ) )
            // InternalGs1.g:2250:1: ( 'AccesVariable' )
            {
            // InternalGs1.g:2250:1: ( 'AccesVariable' )
            // InternalGs1.g:2251:2: 'AccesVariable'
            {
             before(grammarAccess.getAccesVariableAccess().getAccesVariableKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAccesVariableAccess().getAccesVariableKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccesVariable__Group__0__Impl"


    // $ANTLR start "rule__AccesVariable__Group__1"
    // InternalGs1.g:2260:1: rule__AccesVariable__Group__1 : rule__AccesVariable__Group__1__Impl rule__AccesVariable__Group__2 ;
    public final void rule__AccesVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2264:1: ( rule__AccesVariable__Group__1__Impl rule__AccesVariable__Group__2 )
            // InternalGs1.g:2265:2: rule__AccesVariable__Group__1__Impl rule__AccesVariable__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__AccesVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccesVariable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccesVariable__Group__1"


    // $ANTLR start "rule__AccesVariable__Group__1__Impl"
    // InternalGs1.g:2272:1: rule__AccesVariable__Group__1__Impl : ( ( rule__AccesVariable__NameAssignment_1 ) ) ;
    public final void rule__AccesVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2276:1: ( ( ( rule__AccesVariable__NameAssignment_1 ) ) )
            // InternalGs1.g:2277:1: ( ( rule__AccesVariable__NameAssignment_1 ) )
            {
            // InternalGs1.g:2277:1: ( ( rule__AccesVariable__NameAssignment_1 ) )
            // InternalGs1.g:2278:2: ( rule__AccesVariable__NameAssignment_1 )
            {
             before(grammarAccess.getAccesVariableAccess().getNameAssignment_1()); 
            // InternalGs1.g:2279:2: ( rule__AccesVariable__NameAssignment_1 )
            // InternalGs1.g:2279:3: rule__AccesVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AccesVariable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAccesVariableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccesVariable__Group__1__Impl"


    // $ANTLR start "rule__AccesVariable__Group__2"
    // InternalGs1.g:2287:1: rule__AccesVariable__Group__2 : rule__AccesVariable__Group__2__Impl rule__AccesVariable__Group__3 ;
    public final void rule__AccesVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2291:1: ( rule__AccesVariable__Group__2__Impl rule__AccesVariable__Group__3 )
            // InternalGs1.g:2292:2: rule__AccesVariable__Group__2__Impl rule__AccesVariable__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__AccesVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccesVariable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccesVariable__Group__2"


    // $ANTLR start "rule__AccesVariable__Group__2__Impl"
    // InternalGs1.g:2299:1: rule__AccesVariable__Group__2__Impl : ( '{' ) ;
    public final void rule__AccesVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2303:1: ( ( '{' ) )
            // InternalGs1.g:2304:1: ( '{' )
            {
            // InternalGs1.g:2304:1: ( '{' )
            // InternalGs1.g:2305:2: '{'
            {
             before(grammarAccess.getAccesVariableAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAccesVariableAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccesVariable__Group__2__Impl"


    // $ANTLR start "rule__AccesVariable__Group__3"
    // InternalGs1.g:2314:1: rule__AccesVariable__Group__3 : rule__AccesVariable__Group__3__Impl rule__AccesVariable__Group__4 ;
    public final void rule__AccesVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2318:1: ( rule__AccesVariable__Group__3__Impl rule__AccesVariable__Group__4 )
            // InternalGs1.g:2319:2: rule__AccesVariable__Group__3__Impl rule__AccesVariable__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__AccesVariable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccesVariable__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccesVariable__Group__3"


    // $ANTLR start "rule__AccesVariable__Group__3__Impl"
    // InternalGs1.g:2326:1: rule__AccesVariable__Group__3__Impl : ( 'colonne' ) ;
    public final void rule__AccesVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2330:1: ( ( 'colonne' ) )
            // InternalGs1.g:2331:1: ( 'colonne' )
            {
            // InternalGs1.g:2331:1: ( 'colonne' )
            // InternalGs1.g:2332:2: 'colonne'
            {
             before(grammarAccess.getAccesVariableAccess().getColonneKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAccesVariableAccess().getColonneKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccesVariable__Group__3__Impl"


    // $ANTLR start "rule__AccesVariable__Group__4"
    // InternalGs1.g:2341:1: rule__AccesVariable__Group__4 : rule__AccesVariable__Group__4__Impl rule__AccesVariable__Group__5 ;
    public final void rule__AccesVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2345:1: ( rule__AccesVariable__Group__4__Impl rule__AccesVariable__Group__5 )
            // InternalGs1.g:2346:2: rule__AccesVariable__Group__4__Impl rule__AccesVariable__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__AccesVariable__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccesVariable__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccesVariable__Group__4"


    // $ANTLR start "rule__AccesVariable__Group__4__Impl"
    // InternalGs1.g:2353:1: rule__AccesVariable__Group__4__Impl : ( '=' ) ;
    public final void rule__AccesVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2357:1: ( ( '=' ) )
            // InternalGs1.g:2358:1: ( '=' )
            {
            // InternalGs1.g:2358:1: ( '=' )
            // InternalGs1.g:2359:2: '='
            {
             before(grammarAccess.getAccesVariableAccess().getEqualsSignKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAccesVariableAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccesVariable__Group__4__Impl"


    // $ANTLR start "rule__AccesVariable__Group__5"
    // InternalGs1.g:2368:1: rule__AccesVariable__Group__5 : rule__AccesVariable__Group__5__Impl rule__AccesVariable__Group__6 ;
    public final void rule__AccesVariable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2372:1: ( rule__AccesVariable__Group__5__Impl rule__AccesVariable__Group__6 )
            // InternalGs1.g:2373:2: rule__AccesVariable__Group__5__Impl rule__AccesVariable__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__AccesVariable__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccesVariable__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccesVariable__Group__5"


    // $ANTLR start "rule__AccesVariable__Group__5__Impl"
    // InternalGs1.g:2380:1: rule__AccesVariable__Group__5__Impl : ( ( rule__AccesVariable__ColonneAssignment_5 ) ) ;
    public final void rule__AccesVariable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2384:1: ( ( ( rule__AccesVariable__ColonneAssignment_5 ) ) )
            // InternalGs1.g:2385:1: ( ( rule__AccesVariable__ColonneAssignment_5 ) )
            {
            // InternalGs1.g:2385:1: ( ( rule__AccesVariable__ColonneAssignment_5 ) )
            // InternalGs1.g:2386:2: ( rule__AccesVariable__ColonneAssignment_5 )
            {
             before(grammarAccess.getAccesVariableAccess().getColonneAssignment_5()); 
            // InternalGs1.g:2387:2: ( rule__AccesVariable__ColonneAssignment_5 )
            // InternalGs1.g:2387:3: rule__AccesVariable__ColonneAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__AccesVariable__ColonneAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAccesVariableAccess().getColonneAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccesVariable__Group__5__Impl"


    // $ANTLR start "rule__AccesVariable__Group__6"
    // InternalGs1.g:2395:1: rule__AccesVariable__Group__6 : rule__AccesVariable__Group__6__Impl ;
    public final void rule__AccesVariable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2399:1: ( rule__AccesVariable__Group__6__Impl )
            // InternalGs1.g:2400:2: rule__AccesVariable__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccesVariable__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccesVariable__Group__6"


    // $ANTLR start "rule__AccesVariable__Group__6__Impl"
    // InternalGs1.g:2406:1: rule__AccesVariable__Group__6__Impl : ( '}' ) ;
    public final void rule__AccesVariable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2410:1: ( ( '}' ) )
            // InternalGs1.g:2411:1: ( '}' )
            {
            // InternalGs1.g:2411:1: ( '}' )
            // InternalGs1.g:2412:2: '}'
            {
             before(grammarAccess.getAccesVariableAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAccesVariableAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccesVariable__Group__6__Impl"


    // $ANTLR start "rule__Operateur__Group__0"
    // InternalGs1.g:2422:1: rule__Operateur__Group__0 : rule__Operateur__Group__0__Impl rule__Operateur__Group__1 ;
    public final void rule__Operateur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2426:1: ( rule__Operateur__Group__0__Impl rule__Operateur__Group__1 )
            // InternalGs1.g:2427:2: rule__Operateur__Group__0__Impl rule__Operateur__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Operateur__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operateur__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operateur__Group__0"


    // $ANTLR start "rule__Operateur__Group__0__Impl"
    // InternalGs1.g:2434:1: rule__Operateur__Group__0__Impl : ( 'Operateur' ) ;
    public final void rule__Operateur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2438:1: ( ( 'Operateur' ) )
            // InternalGs1.g:2439:1: ( 'Operateur' )
            {
            // InternalGs1.g:2439:1: ( 'Operateur' )
            // InternalGs1.g:2440:2: 'Operateur'
            {
             before(grammarAccess.getOperateurAccess().getOperateurKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getOperateurAccess().getOperateurKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operateur__Group__0__Impl"


    // $ANTLR start "rule__Operateur__Group__1"
    // InternalGs1.g:2449:1: rule__Operateur__Group__1 : rule__Operateur__Group__1__Impl rule__Operateur__Group__2 ;
    public final void rule__Operateur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2453:1: ( rule__Operateur__Group__1__Impl rule__Operateur__Group__2 )
            // InternalGs1.g:2454:2: rule__Operateur__Group__1__Impl rule__Operateur__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Operateur__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operateur__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operateur__Group__1"


    // $ANTLR start "rule__Operateur__Group__1__Impl"
    // InternalGs1.g:2461:1: rule__Operateur__Group__1__Impl : ( '{' ) ;
    public final void rule__Operateur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2465:1: ( ( '{' ) )
            // InternalGs1.g:2466:1: ( '{' )
            {
            // InternalGs1.g:2466:1: ( '{' )
            // InternalGs1.g:2467:2: '{'
            {
             before(grammarAccess.getOperateurAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getOperateurAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operateur__Group__1__Impl"


    // $ANTLR start "rule__Operateur__Group__2"
    // InternalGs1.g:2476:1: rule__Operateur__Group__2 : rule__Operateur__Group__2__Impl rule__Operateur__Group__3 ;
    public final void rule__Operateur__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2480:1: ( rule__Operateur__Group__2__Impl rule__Operateur__Group__3 )
            // InternalGs1.g:2481:2: rule__Operateur__Group__2__Impl rule__Operateur__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Operateur__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operateur__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operateur__Group__2"


    // $ANTLR start "rule__Operateur__Group__2__Impl"
    // InternalGs1.g:2488:1: rule__Operateur__Group__2__Impl : ( 'type' ) ;
    public final void rule__Operateur__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2492:1: ( ( 'type' ) )
            // InternalGs1.g:2493:1: ( 'type' )
            {
            // InternalGs1.g:2493:1: ( 'type' )
            // InternalGs1.g:2494:2: 'type'
            {
             before(grammarAccess.getOperateurAccess().getTypeKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getOperateurAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operateur__Group__2__Impl"


    // $ANTLR start "rule__Operateur__Group__3"
    // InternalGs1.g:2503:1: rule__Operateur__Group__3 : rule__Operateur__Group__3__Impl rule__Operateur__Group__4 ;
    public final void rule__Operateur__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2507:1: ( rule__Operateur__Group__3__Impl rule__Operateur__Group__4 )
            // InternalGs1.g:2508:2: rule__Operateur__Group__3__Impl rule__Operateur__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Operateur__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operateur__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operateur__Group__3"


    // $ANTLR start "rule__Operateur__Group__3__Impl"
    // InternalGs1.g:2515:1: rule__Operateur__Group__3__Impl : ( '=' ) ;
    public final void rule__Operateur__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2519:1: ( ( '=' ) )
            // InternalGs1.g:2520:1: ( '=' )
            {
            // InternalGs1.g:2520:1: ( '=' )
            // InternalGs1.g:2521:2: '='
            {
             before(grammarAccess.getOperateurAccess().getEqualsSignKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getOperateurAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operateur__Group__3__Impl"


    // $ANTLR start "rule__Operateur__Group__4"
    // InternalGs1.g:2530:1: rule__Operateur__Group__4 : rule__Operateur__Group__4__Impl rule__Operateur__Group__5 ;
    public final void rule__Operateur__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2534:1: ( rule__Operateur__Group__4__Impl rule__Operateur__Group__5 )
            // InternalGs1.g:2535:2: rule__Operateur__Group__4__Impl rule__Operateur__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Operateur__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operateur__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operateur__Group__4"


    // $ANTLR start "rule__Operateur__Group__4__Impl"
    // InternalGs1.g:2542:1: rule__Operateur__Group__4__Impl : ( ( rule__Operateur__TypeAssignment_4 ) ) ;
    public final void rule__Operateur__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2546:1: ( ( ( rule__Operateur__TypeAssignment_4 ) ) )
            // InternalGs1.g:2547:1: ( ( rule__Operateur__TypeAssignment_4 ) )
            {
            // InternalGs1.g:2547:1: ( ( rule__Operateur__TypeAssignment_4 ) )
            // InternalGs1.g:2548:2: ( rule__Operateur__TypeAssignment_4 )
            {
             before(grammarAccess.getOperateurAccess().getTypeAssignment_4()); 
            // InternalGs1.g:2549:2: ( rule__Operateur__TypeAssignment_4 )
            // InternalGs1.g:2549:3: rule__Operateur__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Operateur__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOperateurAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operateur__Group__4__Impl"


    // $ANTLR start "rule__Operateur__Group__5"
    // InternalGs1.g:2557:1: rule__Operateur__Group__5 : rule__Operateur__Group__5__Impl ;
    public final void rule__Operateur__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2561:1: ( rule__Operateur__Group__5__Impl )
            // InternalGs1.g:2562:2: rule__Operateur__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operateur__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operateur__Group__5"


    // $ANTLR start "rule__Operateur__Group__5__Impl"
    // InternalGs1.g:2568:1: rule__Operateur__Group__5__Impl : ( '}' ) ;
    public final void rule__Operateur__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2572:1: ( ( '}' ) )
            // InternalGs1.g:2573:1: ( '}' )
            {
            // InternalGs1.g:2573:1: ( '}' )
            // InternalGs1.g:2574:2: '}'
            {
             before(grammarAccess.getOperateurAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getOperateurAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operateur__Group__5__Impl"


    // $ANTLR start "rule__Model__ApplicationsAssignment"
    // InternalGs1.g:2584:1: rule__Model__ApplicationsAssignment : ( ruleApplication ) ;
    public final void rule__Model__ApplicationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2588:1: ( ( ruleApplication ) )
            // InternalGs1.g:2589:2: ( ruleApplication )
            {
            // InternalGs1.g:2589:2: ( ruleApplication )
            // InternalGs1.g:2590:3: ruleApplication
            {
             before(grammarAccess.getModelAccess().getApplicationsApplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleApplication();

            state._fsp--;

             after(grammarAccess.getModelAccess().getApplicationsApplicationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ApplicationsAssignment"


    // $ANTLR start "rule__Application__TablesAssignment_2"
    // InternalGs1.g:2599:1: rule__Application__TablesAssignment_2 : ( ruleTable ) ;
    public final void rule__Application__TablesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2603:1: ( ( ruleTable ) )
            // InternalGs1.g:2604:2: ( ruleTable )
            {
            // InternalGs1.g:2604:2: ( ruleTable )
            // InternalGs1.g:2605:3: ruleTable
            {
             before(grammarAccess.getApplicationAccess().getTablesTableParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getTablesTableParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__TablesAssignment_2"


    // $ANTLR start "rule__Table__NameAssignment_1"
    // InternalGs1.g:2614:1: rule__Table__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Table__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2618:1: ( ( RULE_ID ) )
            // InternalGs1.g:2619:2: ( RULE_ID )
            {
            // InternalGs1.g:2619:2: ( RULE_ID )
            // InternalGs1.g:2620:3: RULE_ID
            {
             before(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__NameAssignment_1"


    // $ANTLR start "rule__Table__IdAssignment_5"
    // InternalGs1.g:2629:1: rule__Table__IdAssignment_5 : ( RULE_INT ) ;
    public final void rule__Table__IdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2633:1: ( ( RULE_INT ) )
            // InternalGs1.g:2634:2: ( RULE_INT )
            {
            // InternalGs1.g:2634:2: ( RULE_INT )
            // InternalGs1.g:2635:3: RULE_INT
            {
             before(grammarAccess.getTableAccess().getIdINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getIdINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__IdAssignment_5"


    // $ANTLR start "rule__Table__NomAssignment_8"
    // InternalGs1.g:2644:1: rule__Table__NomAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Table__NomAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2648:1: ( ( RULE_STRING ) )
            // InternalGs1.g:2649:2: ( RULE_STRING )
            {
            // InternalGs1.g:2649:2: ( RULE_STRING )
            // InternalGs1.g:2650:3: RULE_STRING
            {
             before(grammarAccess.getTableAccess().getNomSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getNomSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__NomAssignment_8"


    // $ANTLR start "rule__Table__ColonnesAssignment_9"
    // InternalGs1.g:2659:1: rule__Table__ColonnesAssignment_9 : ( ruleColonne ) ;
    public final void rule__Table__ColonnesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2663:1: ( ( ruleColonne ) )
            // InternalGs1.g:2664:2: ( ruleColonne )
            {
            // InternalGs1.g:2664:2: ( ruleColonne )
            // InternalGs1.g:2665:3: ruleColonne
            {
             before(grammarAccess.getTableAccess().getColonnesColonneParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleColonne();

            state._fsp--;

             after(grammarAccess.getTableAccess().getColonnesColonneParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__ColonnesAssignment_9"


    // $ANTLR start "rule__Colonne_derivee__NameAssignment_1"
    // InternalGs1.g:2674:1: rule__Colonne_derivee__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Colonne_derivee__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2678:1: ( ( RULE_ID ) )
            // InternalGs1.g:2679:2: ( RULE_ID )
            {
            // InternalGs1.g:2679:2: ( RULE_ID )
            // InternalGs1.g:2680:3: RULE_ID
            {
             before(grammarAccess.getColonne_deriveeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getColonne_deriveeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_derivee__NameAssignment_1"


    // $ANTLR start "rule__Colonne_derivee__IdAssignment_5"
    // InternalGs1.g:2689:1: rule__Colonne_derivee__IdAssignment_5 : ( RULE_INT ) ;
    public final void rule__Colonne_derivee__IdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2693:1: ( ( RULE_INT ) )
            // InternalGs1.g:2694:2: ( RULE_INT )
            {
            // InternalGs1.g:2694:2: ( RULE_INT )
            // InternalGs1.g:2695:3: RULE_INT
            {
             before(grammarAccess.getColonne_deriveeAccess().getIdINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getColonne_deriveeAccess().getIdINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_derivee__IdAssignment_5"


    // $ANTLR start "rule__Colonne_derivee__NomAssignment_8"
    // InternalGs1.g:2704:1: rule__Colonne_derivee__NomAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Colonne_derivee__NomAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2708:1: ( ( RULE_STRING ) )
            // InternalGs1.g:2709:2: ( RULE_STRING )
            {
            // InternalGs1.g:2709:2: ( RULE_STRING )
            // InternalGs1.g:2710:3: RULE_STRING
            {
             before(grammarAccess.getColonne_deriveeAccess().getNomSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getColonne_deriveeAccess().getNomSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_derivee__NomAssignment_8"


    // $ANTLR start "rule__Colonne_derivee__ExpressionAssignment_11"
    // InternalGs1.g:2719:1: rule__Colonne_derivee__ExpressionAssignment_11 : ( ruleExpression ) ;
    public final void rule__Colonne_derivee__ExpressionAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2723:1: ( ( ruleExpression ) )
            // InternalGs1.g:2724:2: ( ruleExpression )
            {
            // InternalGs1.g:2724:2: ( ruleExpression )
            // InternalGs1.g:2725:3: ruleExpression
            {
             before(grammarAccess.getColonne_deriveeAccess().getExpressionExpressionParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getColonne_deriveeAccess().getExpressionExpressionParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_derivee__ExpressionAssignment_11"


    // $ANTLR start "rule__Colonne_referencee__NameAssignment_1"
    // InternalGs1.g:2734:1: rule__Colonne_referencee__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Colonne_referencee__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2738:1: ( ( RULE_ID ) )
            // InternalGs1.g:2739:2: ( RULE_ID )
            {
            // InternalGs1.g:2739:2: ( RULE_ID )
            // InternalGs1.g:2740:3: RULE_ID
            {
             before(grammarAccess.getColonne_referenceeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getColonne_referenceeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_referencee__NameAssignment_1"


    // $ANTLR start "rule__Colonne_referencee__IdAssignment_5"
    // InternalGs1.g:2749:1: rule__Colonne_referencee__IdAssignment_5 : ( RULE_INT ) ;
    public final void rule__Colonne_referencee__IdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2753:1: ( ( RULE_INT ) )
            // InternalGs1.g:2754:2: ( RULE_INT )
            {
            // InternalGs1.g:2754:2: ( RULE_INT )
            // InternalGs1.g:2755:3: RULE_INT
            {
             before(grammarAccess.getColonne_referenceeAccess().getIdINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getColonne_referenceeAccess().getIdINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_referencee__IdAssignment_5"


    // $ANTLR start "rule__Colonne_referencee__NomAssignment_8"
    // InternalGs1.g:2764:1: rule__Colonne_referencee__NomAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Colonne_referencee__NomAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2768:1: ( ( RULE_STRING ) )
            // InternalGs1.g:2769:2: ( RULE_STRING )
            {
            // InternalGs1.g:2769:2: ( RULE_STRING )
            // InternalGs1.g:2770:3: RULE_STRING
            {
             before(grammarAccess.getColonne_referenceeAccess().getNomSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getColonne_referenceeAccess().getNomSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_referencee__NomAssignment_8"


    // $ANTLR start "rule__Colonne_referencee__TableAssignment_11"
    // InternalGs1.g:2779:1: rule__Colonne_referencee__TableAssignment_11 : ( ( RULE_ID ) ) ;
    public final void rule__Colonne_referencee__TableAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2783:1: ( ( ( RULE_ID ) ) )
            // InternalGs1.g:2784:2: ( ( RULE_ID ) )
            {
            // InternalGs1.g:2784:2: ( ( RULE_ID ) )
            // InternalGs1.g:2785:3: ( RULE_ID )
            {
             before(grammarAccess.getColonne_referenceeAccess().getTableTableCrossReference_11_0()); 
            // InternalGs1.g:2786:3: ( RULE_ID )
            // InternalGs1.g:2787:4: RULE_ID
            {
             before(grammarAccess.getColonne_referenceeAccess().getTableTableIDTerminalRuleCall_11_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getColonne_referenceeAccess().getTableTableIDTerminalRuleCall_11_0_1()); 

            }

             after(grammarAccess.getColonne_referenceeAccess().getTableTableCrossReference_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_referencee__TableAssignment_11"


    // $ANTLR start "rule__Colonne_referencee__ColonneAssignment_14"
    // InternalGs1.g:2798:1: rule__Colonne_referencee__ColonneAssignment_14 : ( ( RULE_ID ) ) ;
    public final void rule__Colonne_referencee__ColonneAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2802:1: ( ( ( RULE_ID ) ) )
            // InternalGs1.g:2803:2: ( ( RULE_ID ) )
            {
            // InternalGs1.g:2803:2: ( ( RULE_ID ) )
            // InternalGs1.g:2804:3: ( RULE_ID )
            {
             before(grammarAccess.getColonne_referenceeAccess().getColonneColonneCrossReference_14_0()); 
            // InternalGs1.g:2805:3: ( RULE_ID )
            // InternalGs1.g:2806:4: RULE_ID
            {
             before(grammarAccess.getColonne_referenceeAccess().getColonneColonneIDTerminalRuleCall_14_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getColonne_referenceeAccess().getColonneColonneIDTerminalRuleCall_14_0_1()); 

            }

             after(grammarAccess.getColonne_referenceeAccess().getColonneColonneCrossReference_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne_referencee__ColonneAssignment_14"


    // $ANTLR start "rule__Colonnesimple__NameAssignment_1"
    // InternalGs1.g:2817:1: rule__Colonnesimple__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Colonnesimple__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2821:1: ( ( RULE_ID ) )
            // InternalGs1.g:2822:2: ( RULE_ID )
            {
            // InternalGs1.g:2822:2: ( RULE_ID )
            // InternalGs1.g:2823:3: RULE_ID
            {
             before(grammarAccess.getColonnesimpleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getColonnesimpleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonnesimple__NameAssignment_1"


    // $ANTLR start "rule__Colonnesimple__IdAssignment_5"
    // InternalGs1.g:2832:1: rule__Colonnesimple__IdAssignment_5 : ( RULE_INT ) ;
    public final void rule__Colonnesimple__IdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2836:1: ( ( RULE_INT ) )
            // InternalGs1.g:2837:2: ( RULE_INT )
            {
            // InternalGs1.g:2837:2: ( RULE_INT )
            // InternalGs1.g:2838:3: RULE_INT
            {
             before(grammarAccess.getColonnesimpleAccess().getIdINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getColonnesimpleAccess().getIdINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonnesimple__IdAssignment_5"


    // $ANTLR start "rule__Colonnesimple__NomAssignment_8"
    // InternalGs1.g:2847:1: rule__Colonnesimple__NomAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Colonnesimple__NomAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2851:1: ( ( RULE_STRING ) )
            // InternalGs1.g:2852:2: ( RULE_STRING )
            {
            // InternalGs1.g:2852:2: ( RULE_STRING )
            // InternalGs1.g:2853:3: RULE_STRING
            {
             before(grammarAccess.getColonnesimpleAccess().getNomSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getColonnesimpleAccess().getNomSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonnesimple__NomAssignment_8"


    // $ANTLR start "rule__ExpressionBinaire__NameAssignment_1"
    // InternalGs1.g:2862:1: rule__ExpressionBinaire__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExpressionBinaire__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2866:1: ( ( RULE_ID ) )
            // InternalGs1.g:2867:2: ( RULE_ID )
            {
            // InternalGs1.g:2867:2: ( RULE_ID )
            // InternalGs1.g:2868:3: RULE_ID
            {
             before(grammarAccess.getExpressionBinaireAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExpressionBinaireAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBinaire__NameAssignment_1"


    // $ANTLR start "rule__ExpressionBinaire__OperandeGAssignment_5"
    // InternalGs1.g:2877:1: rule__ExpressionBinaire__OperandeGAssignment_5 : ( ruleExpression ) ;
    public final void rule__ExpressionBinaire__OperandeGAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2881:1: ( ( ruleExpression ) )
            // InternalGs1.g:2882:2: ( ruleExpression )
            {
            // InternalGs1.g:2882:2: ( ruleExpression )
            // InternalGs1.g:2883:3: ruleExpression
            {
             before(grammarAccess.getExpressionBinaireAccess().getOperandeGExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionBinaireAccess().getOperandeGExpressionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBinaire__OperandeGAssignment_5"


    // $ANTLR start "rule__ExpressionBinaire__OperateurAssignment_8"
    // InternalGs1.g:2892:1: rule__ExpressionBinaire__OperateurAssignment_8 : ( ruleOperateur ) ;
    public final void rule__ExpressionBinaire__OperateurAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2896:1: ( ( ruleOperateur ) )
            // InternalGs1.g:2897:2: ( ruleOperateur )
            {
            // InternalGs1.g:2897:2: ( ruleOperateur )
            // InternalGs1.g:2898:3: ruleOperateur
            {
             before(grammarAccess.getExpressionBinaireAccess().getOperateurOperateurParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleOperateur();

            state._fsp--;

             after(grammarAccess.getExpressionBinaireAccess().getOperateurOperateurParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBinaire__OperateurAssignment_8"


    // $ANTLR start "rule__ExpressionBinaire__OperandeDAssignment_11"
    // InternalGs1.g:2907:1: rule__ExpressionBinaire__OperandeDAssignment_11 : ( ruleExpression ) ;
    public final void rule__ExpressionBinaire__OperandeDAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2911:1: ( ( ruleExpression ) )
            // InternalGs1.g:2912:2: ( ruleExpression )
            {
            // InternalGs1.g:2912:2: ( ruleExpression )
            // InternalGs1.g:2913:3: ruleExpression
            {
             before(grammarAccess.getExpressionBinaireAccess().getOperandeDExpressionParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionBinaireAccess().getOperandeDExpressionParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBinaire__OperandeDAssignment_11"


    // $ANTLR start "rule__AccesVariable__NameAssignment_1"
    // InternalGs1.g:2922:1: rule__AccesVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AccesVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2926:1: ( ( RULE_ID ) )
            // InternalGs1.g:2927:2: ( RULE_ID )
            {
            // InternalGs1.g:2927:2: ( RULE_ID )
            // InternalGs1.g:2928:3: RULE_ID
            {
             before(grammarAccess.getAccesVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAccesVariableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccesVariable__NameAssignment_1"


    // $ANTLR start "rule__AccesVariable__ColonneAssignment_5"
    // InternalGs1.g:2937:1: rule__AccesVariable__ColonneAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__AccesVariable__ColonneAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2941:1: ( ( ( RULE_ID ) ) )
            // InternalGs1.g:2942:2: ( ( RULE_ID ) )
            {
            // InternalGs1.g:2942:2: ( ( RULE_ID ) )
            // InternalGs1.g:2943:3: ( RULE_ID )
            {
             before(grammarAccess.getAccesVariableAccess().getColonneColonneCrossReference_5_0()); 
            // InternalGs1.g:2944:3: ( RULE_ID )
            // InternalGs1.g:2945:4: RULE_ID
            {
             before(grammarAccess.getAccesVariableAccess().getColonneColonneIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAccesVariableAccess().getColonneColonneIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getAccesVariableAccess().getColonneColonneCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccesVariable__ColonneAssignment_5"


    // $ANTLR start "rule__Operateur__TypeAssignment_4"
    // InternalGs1.g:2956:1: rule__Operateur__TypeAssignment_4 : ( ruleOperations ) ;
    public final void rule__Operateur__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGs1.g:2960:1: ( ( ruleOperations ) )
            // InternalGs1.g:2961:2: ( ruleOperations )
            {
            // InternalGs1.g:2961:2: ( ruleOperations )
            // InternalGs1.g:2962:3: ruleOperations
            {
             before(grammarAccess.getOperateurAccess().getTypeOperationsEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleOperations();

            state._fsp--;

             after(grammarAccess.getOperateurAccess().getTypeOperationsEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operateur__TypeAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000009420000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000009400002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000110000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000007800L});

}