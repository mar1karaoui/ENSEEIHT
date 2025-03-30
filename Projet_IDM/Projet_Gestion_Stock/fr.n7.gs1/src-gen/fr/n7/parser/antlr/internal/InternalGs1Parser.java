package fr.n7.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.n7.services.Gs1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGs1Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Application'", "'{'", "'}'", "'Table'", "'id'", "'='", "'Nom'", "'Colonne_derivee'", "'expression'", "'Colonne_referencee'", "'table'", "'colonne'", "'Colonnesimple'", "'ExpressionBinaire'", "'operandeG'", "'operateur'", "'operandeD'", "'AccesVariable'", "'Operateur'", "'type'", "'addition'", "'soustraction'", "'multiplication'", "'division'"
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

        public InternalGs1Parser(TokenStream input, Gs1GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected Gs1GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalGs1.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalGs1.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalGs1.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalGs1.g:72:1: ruleModel returns [EObject current=null] : ( (lv_applications_0_0= ruleApplication ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_applications_0_0 = null;



        	enterRule();

        try {
            // InternalGs1.g:78:2: ( ( (lv_applications_0_0= ruleApplication ) )* )
            // InternalGs1.g:79:2: ( (lv_applications_0_0= ruleApplication ) )*
            {
            // InternalGs1.g:79:2: ( (lv_applications_0_0= ruleApplication ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGs1.g:80:3: (lv_applications_0_0= ruleApplication )
            	    {
            	    // InternalGs1.g:80:3: (lv_applications_0_0= ruleApplication )
            	    // InternalGs1.g:81:4: lv_applications_0_0= ruleApplication
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getApplicationsApplicationParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_applications_0_0=ruleApplication();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"applications",
            	    					lv_applications_0_0,
            	    					"fr.n7.Gs1.Application");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleApplication"
    // InternalGs1.g:101:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // InternalGs1.g:101:52: (iv_ruleApplication= ruleApplication EOF )
            // InternalGs1.g:102:2: iv_ruleApplication= ruleApplication EOF
            {
             newCompositeNode(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplication=ruleApplication();

            state._fsp--;

             current =iv_ruleApplication; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // InternalGs1.g:108:1: ruleApplication returns [EObject current=null] : (otherlv_0= 'Application' otherlv_1= '{' ( (lv_tables_2_0= ruleTable ) )* otherlv_3= '}' ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_tables_2_0 = null;



        	enterRule();

        try {
            // InternalGs1.g:114:2: ( (otherlv_0= 'Application' otherlv_1= '{' ( (lv_tables_2_0= ruleTable ) )* otherlv_3= '}' ) )
            // InternalGs1.g:115:2: (otherlv_0= 'Application' otherlv_1= '{' ( (lv_tables_2_0= ruleTable ) )* otherlv_3= '}' )
            {
            // InternalGs1.g:115:2: (otherlv_0= 'Application' otherlv_1= '{' ( (lv_tables_2_0= ruleTable ) )* otherlv_3= '}' )
            // InternalGs1.g:116:3: otherlv_0= 'Application' otherlv_1= '{' ( (lv_tables_2_0= ruleTable ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationAccess().getApplicationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGs1.g:124:3: ( (lv_tables_2_0= ruleTable ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGs1.g:125:4: (lv_tables_2_0= ruleTable )
            	    {
            	    // InternalGs1.g:125:4: (lv_tables_2_0= ruleTable )
            	    // InternalGs1.g:126:5: lv_tables_2_0= ruleTable
            	    {

            	    					newCompositeNode(grammarAccess.getApplicationAccess().getTablesTableParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_tables_2_0=ruleTable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getApplicationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tables",
            	    						lv_tables_2_0,
            	    						"fr.n7.Gs1.Table");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleTable"
    // InternalGs1.g:151:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalGs1.g:151:46: (iv_ruleTable= ruleTable EOF )
            // InternalGs1.g:152:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalGs1.g:158:1: ruleTable returns [EObject current=null] : (otherlv_0= 'Table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= 'Nom' otherlv_7= '=' ( (lv_Nom_8_0= RULE_STRING ) ) ( (lv_colonnes_9_0= ruleColonne ) )* otherlv_10= '}' ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_id_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_Nom_8_0=null;
        Token otherlv_10=null;
        EObject lv_colonnes_9_0 = null;



        	enterRule();

        try {
            // InternalGs1.g:164:2: ( (otherlv_0= 'Table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= 'Nom' otherlv_7= '=' ( (lv_Nom_8_0= RULE_STRING ) ) ( (lv_colonnes_9_0= ruleColonne ) )* otherlv_10= '}' ) )
            // InternalGs1.g:165:2: (otherlv_0= 'Table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= 'Nom' otherlv_7= '=' ( (lv_Nom_8_0= RULE_STRING ) ) ( (lv_colonnes_9_0= ruleColonne ) )* otherlv_10= '}' )
            {
            // InternalGs1.g:165:2: (otherlv_0= 'Table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= 'Nom' otherlv_7= '=' ( (lv_Nom_8_0= RULE_STRING ) ) ( (lv_colonnes_9_0= ruleColonne ) )* otherlv_10= '}' )
            // InternalGs1.g:166:3: otherlv_0= 'Table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= 'Nom' otherlv_7= '=' ( (lv_Nom_8_0= RULE_STRING ) ) ( (lv_colonnes_9_0= ruleColonne ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTableKeyword_0());
            		
            // InternalGs1.g:170:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGs1.g:171:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGs1.g:171:4: (lv_name_1_0= RULE_ID )
            // InternalGs1.g:172:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getTableAccess().getIdKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getTableAccess().getEqualsSignKeyword_4());
            		
            // InternalGs1.g:200:3: ( (lv_id_5_0= RULE_INT ) )
            // InternalGs1.g:201:4: (lv_id_5_0= RULE_INT )
            {
            // InternalGs1.g:201:4: (lv_id_5_0= RULE_INT )
            // InternalGs1.g:202:5: lv_id_5_0= RULE_INT
            {
            lv_id_5_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_id_5_0, grammarAccess.getTableAccess().getIdINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getTableAccess().getNomKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getTableAccess().getEqualsSignKeyword_7());
            		
            // InternalGs1.g:226:3: ( (lv_Nom_8_0= RULE_STRING ) )
            // InternalGs1.g:227:4: (lv_Nom_8_0= RULE_STRING )
            {
            // InternalGs1.g:227:4: (lv_Nom_8_0= RULE_STRING )
            // InternalGs1.g:228:5: lv_Nom_8_0= RULE_STRING
            {
            lv_Nom_8_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_Nom_8_0, grammarAccess.getTableAccess().getNomSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Nom",
            						lv_Nom_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalGs1.g:244:3: ( (lv_colonnes_9_0= ruleColonne ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18||LA3_0==20||LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGs1.g:245:4: (lv_colonnes_9_0= ruleColonne )
            	    {
            	    // InternalGs1.g:245:4: (lv_colonnes_9_0= ruleColonne )
            	    // InternalGs1.g:246:5: lv_colonnes_9_0= ruleColonne
            	    {

            	    					newCompositeNode(grammarAccess.getTableAccess().getColonnesColonneParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_colonnes_9_0=ruleColonne();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTableRule());
            	    					}
            	    					add(
            	    						current,
            	    						"colonnes",
            	    						lv_colonnes_9_0,
            	    						"fr.n7.Gs1.Colonne");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_10=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleColonne"
    // InternalGs1.g:271:1: entryRuleColonne returns [EObject current=null] : iv_ruleColonne= ruleColonne EOF ;
    public final EObject entryRuleColonne() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColonne = null;


        try {
            // InternalGs1.g:271:48: (iv_ruleColonne= ruleColonne EOF )
            // InternalGs1.g:272:2: iv_ruleColonne= ruleColonne EOF
            {
             newCompositeNode(grammarAccess.getColonneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColonne=ruleColonne();

            state._fsp--;

             current =iv_ruleColonne; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColonne"


    // $ANTLR start "ruleColonne"
    // InternalGs1.g:278:1: ruleColonne returns [EObject current=null] : (this_Colonne_derivee_0= ruleColonne_derivee | this_Colonne_referencee_1= ruleColonne_referencee | this_Colonnesimple_2= ruleColonnesimple ) ;
    public final EObject ruleColonne() throws RecognitionException {
        EObject current = null;

        EObject this_Colonne_derivee_0 = null;

        EObject this_Colonne_referencee_1 = null;

        EObject this_Colonnesimple_2 = null;



        	enterRule();

        try {
            // InternalGs1.g:284:2: ( (this_Colonne_derivee_0= ruleColonne_derivee | this_Colonne_referencee_1= ruleColonne_referencee | this_Colonnesimple_2= ruleColonnesimple ) )
            // InternalGs1.g:285:2: (this_Colonne_derivee_0= ruleColonne_derivee | this_Colonne_referencee_1= ruleColonne_referencee | this_Colonnesimple_2= ruleColonnesimple )
            {
            // InternalGs1.g:285:2: (this_Colonne_derivee_0= ruleColonne_derivee | this_Colonne_referencee_1= ruleColonne_referencee | this_Colonnesimple_2= ruleColonnesimple )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case 20:
                {
                alt4=2;
                }
                break;
            case 23:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalGs1.g:286:3: this_Colonne_derivee_0= ruleColonne_derivee
                    {

                    			newCompositeNode(grammarAccess.getColonneAccess().getColonne_deriveeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Colonne_derivee_0=ruleColonne_derivee();

                    state._fsp--;


                    			current = this_Colonne_derivee_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGs1.g:295:3: this_Colonne_referencee_1= ruleColonne_referencee
                    {

                    			newCompositeNode(grammarAccess.getColonneAccess().getColonne_referenceeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Colonne_referencee_1=ruleColonne_referencee();

                    state._fsp--;


                    			current = this_Colonne_referencee_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGs1.g:304:3: this_Colonnesimple_2= ruleColonnesimple
                    {

                    			newCompositeNode(grammarAccess.getColonneAccess().getColonnesimpleParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Colonnesimple_2=ruleColonnesimple();

                    state._fsp--;


                    			current = this_Colonnesimple_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColonne"


    // $ANTLR start "entryRuleColonne_derivee"
    // InternalGs1.g:316:1: entryRuleColonne_derivee returns [EObject current=null] : iv_ruleColonne_derivee= ruleColonne_derivee EOF ;
    public final EObject entryRuleColonne_derivee() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColonne_derivee = null;


        try {
            // InternalGs1.g:316:56: (iv_ruleColonne_derivee= ruleColonne_derivee EOF )
            // InternalGs1.g:317:2: iv_ruleColonne_derivee= ruleColonne_derivee EOF
            {
             newCompositeNode(grammarAccess.getColonne_deriveeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColonne_derivee=ruleColonne_derivee();

            state._fsp--;

             current =iv_ruleColonne_derivee; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColonne_derivee"


    // $ANTLR start "ruleColonne_derivee"
    // InternalGs1.g:323:1: ruleColonne_derivee returns [EObject current=null] : (otherlv_0= 'Colonne_derivee' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= 'Nom' otherlv_7= '=' ( (lv_Nom_8_0= RULE_STRING ) ) otherlv_9= 'expression' otherlv_10= '=' ( (lv_expression_11_0= ruleExpression ) ) otherlv_12= '}' ) ;
    public final EObject ruleColonne_derivee() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_id_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_Nom_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_expression_11_0 = null;



        	enterRule();

        try {
            // InternalGs1.g:329:2: ( (otherlv_0= 'Colonne_derivee' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= 'Nom' otherlv_7= '=' ( (lv_Nom_8_0= RULE_STRING ) ) otherlv_9= 'expression' otherlv_10= '=' ( (lv_expression_11_0= ruleExpression ) ) otherlv_12= '}' ) )
            // InternalGs1.g:330:2: (otherlv_0= 'Colonne_derivee' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= 'Nom' otherlv_7= '=' ( (lv_Nom_8_0= RULE_STRING ) ) otherlv_9= 'expression' otherlv_10= '=' ( (lv_expression_11_0= ruleExpression ) ) otherlv_12= '}' )
            {
            // InternalGs1.g:330:2: (otherlv_0= 'Colonne_derivee' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= 'Nom' otherlv_7= '=' ( (lv_Nom_8_0= RULE_STRING ) ) otherlv_9= 'expression' otherlv_10= '=' ( (lv_expression_11_0= ruleExpression ) ) otherlv_12= '}' )
            // InternalGs1.g:331:3: otherlv_0= 'Colonne_derivee' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= 'Nom' otherlv_7= '=' ( (lv_Nom_8_0= RULE_STRING ) ) otherlv_9= 'expression' otherlv_10= '=' ( (lv_expression_11_0= ruleExpression ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getColonne_deriveeAccess().getColonne_deriveeKeyword_0());
            		
            // InternalGs1.g:335:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGs1.g:336:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGs1.g:336:4: (lv_name_1_0= RULE_ID )
            // InternalGs1.g:337:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getColonne_deriveeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColonne_deriveeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getColonne_deriveeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getColonne_deriveeAccess().getIdKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getColonne_deriveeAccess().getEqualsSignKeyword_4());
            		
            // InternalGs1.g:365:3: ( (lv_id_5_0= RULE_INT ) )
            // InternalGs1.g:366:4: (lv_id_5_0= RULE_INT )
            {
            // InternalGs1.g:366:4: (lv_id_5_0= RULE_INT )
            // InternalGs1.g:367:5: lv_id_5_0= RULE_INT
            {
            lv_id_5_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_id_5_0, grammarAccess.getColonne_deriveeAccess().getIdINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColonne_deriveeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getColonne_deriveeAccess().getNomKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getColonne_deriveeAccess().getEqualsSignKeyword_7());
            		
            // InternalGs1.g:391:3: ( (lv_Nom_8_0= RULE_STRING ) )
            // InternalGs1.g:392:4: (lv_Nom_8_0= RULE_STRING )
            {
            // InternalGs1.g:392:4: (lv_Nom_8_0= RULE_STRING )
            // InternalGs1.g:393:5: lv_Nom_8_0= RULE_STRING
            {
            lv_Nom_8_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_Nom_8_0, grammarAccess.getColonne_deriveeAccess().getNomSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColonne_deriveeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Nom",
            						lv_Nom_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getColonne_deriveeAccess().getExpressionKeyword_9());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_10, grammarAccess.getColonne_deriveeAccess().getEqualsSignKeyword_10());
            		
            // InternalGs1.g:417:3: ( (lv_expression_11_0= ruleExpression ) )
            // InternalGs1.g:418:4: (lv_expression_11_0= ruleExpression )
            {
            // InternalGs1.g:418:4: (lv_expression_11_0= ruleExpression )
            // InternalGs1.g:419:5: lv_expression_11_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getColonne_deriveeAccess().getExpressionExpressionParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_15);
            lv_expression_11_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColonne_deriveeRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_11_0,
            						"fr.n7.Gs1.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getColonne_deriveeAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColonne_derivee"


    // $ANTLR start "entryRuleColonne_referencee"
    // InternalGs1.g:444:1: entryRuleColonne_referencee returns [EObject current=null] : iv_ruleColonne_referencee= ruleColonne_referencee EOF ;
    public final EObject entryRuleColonne_referencee() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColonne_referencee = null;


        try {
            // InternalGs1.g:444:59: (iv_ruleColonne_referencee= ruleColonne_referencee EOF )
            // InternalGs1.g:445:2: iv_ruleColonne_referencee= ruleColonne_referencee EOF
            {
             newCompositeNode(grammarAccess.getColonne_referenceeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColonne_referencee=ruleColonne_referencee();

            state._fsp--;

             current =iv_ruleColonne_referencee; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColonne_referencee"


    // $ANTLR start "ruleColonne_referencee"
    // InternalGs1.g:451:1: ruleColonne_referencee returns [EObject current=null] : (otherlv_0= 'Colonne_referencee' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= 'Nom' otherlv_7= '=' ( (lv_Nom_8_0= RULE_STRING ) ) otherlv_9= 'table' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) otherlv_12= 'colonne' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) otherlv_15= '}' ) ;
    public final EObject ruleColonne_referencee() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_id_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_Nom_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;


        	enterRule();

        try {
            // InternalGs1.g:457:2: ( (otherlv_0= 'Colonne_referencee' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= 'Nom' otherlv_7= '=' ( (lv_Nom_8_0= RULE_STRING ) ) otherlv_9= 'table' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) otherlv_12= 'colonne' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) otherlv_15= '}' ) )
            // InternalGs1.g:458:2: (otherlv_0= 'Colonne_referencee' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= 'Nom' otherlv_7= '=' ( (lv_Nom_8_0= RULE_STRING ) ) otherlv_9= 'table' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) otherlv_12= 'colonne' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) otherlv_15= '}' )
            {
            // InternalGs1.g:458:2: (otherlv_0= 'Colonne_referencee' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= 'Nom' otherlv_7= '=' ( (lv_Nom_8_0= RULE_STRING ) ) otherlv_9= 'table' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) otherlv_12= 'colonne' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) otherlv_15= '}' )
            // InternalGs1.g:459:3: otherlv_0= 'Colonne_referencee' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= 'Nom' otherlv_7= '=' ( (lv_Nom_8_0= RULE_STRING ) ) otherlv_9= 'table' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) otherlv_12= 'colonne' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getColonne_referenceeAccess().getColonne_referenceeKeyword_0());
            		
            // InternalGs1.g:463:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGs1.g:464:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGs1.g:464:4: (lv_name_1_0= RULE_ID )
            // InternalGs1.g:465:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getColonne_referenceeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColonne_referenceeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getColonne_referenceeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getColonne_referenceeAccess().getIdKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getColonne_referenceeAccess().getEqualsSignKeyword_4());
            		
            // InternalGs1.g:493:3: ( (lv_id_5_0= RULE_INT ) )
            // InternalGs1.g:494:4: (lv_id_5_0= RULE_INT )
            {
            // InternalGs1.g:494:4: (lv_id_5_0= RULE_INT )
            // InternalGs1.g:495:5: lv_id_5_0= RULE_INT
            {
            lv_id_5_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_id_5_0, grammarAccess.getColonne_referenceeAccess().getIdINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColonne_referenceeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getColonne_referenceeAccess().getNomKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getColonne_referenceeAccess().getEqualsSignKeyword_7());
            		
            // InternalGs1.g:519:3: ( (lv_Nom_8_0= RULE_STRING ) )
            // InternalGs1.g:520:4: (lv_Nom_8_0= RULE_STRING )
            {
            // InternalGs1.g:520:4: (lv_Nom_8_0= RULE_STRING )
            // InternalGs1.g:521:5: lv_Nom_8_0= RULE_STRING
            {
            lv_Nom_8_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_Nom_8_0, grammarAccess.getColonne_referenceeAccess().getNomSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColonne_referenceeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Nom",
            						lv_Nom_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getColonne_referenceeAccess().getTableKeyword_9());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_10, grammarAccess.getColonne_referenceeAccess().getEqualsSignKeyword_10());
            		
            // InternalGs1.g:545:3: ( (otherlv_11= RULE_ID ) )
            // InternalGs1.g:546:4: (otherlv_11= RULE_ID )
            {
            // InternalGs1.g:546:4: (otherlv_11= RULE_ID )
            // InternalGs1.g:547:5: otherlv_11= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColonne_referenceeRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_11, grammarAccess.getColonne_referenceeAccess().getTableTableCrossReference_11_0());
            				

            }


            }

            otherlv_12=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_12, grammarAccess.getColonne_referenceeAccess().getColonneKeyword_12());
            		
            otherlv_13=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_13, grammarAccess.getColonne_referenceeAccess().getEqualsSignKeyword_13());
            		
            // InternalGs1.g:566:3: ( (otherlv_14= RULE_ID ) )
            // InternalGs1.g:567:4: (otherlv_14= RULE_ID )
            {
            // InternalGs1.g:567:4: (otherlv_14= RULE_ID )
            // InternalGs1.g:568:5: otherlv_14= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColonne_referenceeRule());
            					}
            				
            otherlv_14=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_14, grammarAccess.getColonne_referenceeAccess().getColonneColonneCrossReference_14_0());
            				

            }


            }

            otherlv_15=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getColonne_referenceeAccess().getRightCurlyBracketKeyword_15());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColonne_referencee"


    // $ANTLR start "entryRuleColonnesimple"
    // InternalGs1.g:587:1: entryRuleColonnesimple returns [EObject current=null] : iv_ruleColonnesimple= ruleColonnesimple EOF ;
    public final EObject entryRuleColonnesimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColonnesimple = null;


        try {
            // InternalGs1.g:587:54: (iv_ruleColonnesimple= ruleColonnesimple EOF )
            // InternalGs1.g:588:2: iv_ruleColonnesimple= ruleColonnesimple EOF
            {
             newCompositeNode(grammarAccess.getColonnesimpleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColonnesimple=ruleColonnesimple();

            state._fsp--;

             current =iv_ruleColonnesimple; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColonnesimple"


    // $ANTLR start "ruleColonnesimple"
    // InternalGs1.g:594:1: ruleColonnesimple returns [EObject current=null] : (otherlv_0= 'Colonnesimple' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= 'Nom' otherlv_7= '=' ( (lv_Nom_8_0= RULE_STRING ) ) otherlv_9= '}' ) ;
    public final EObject ruleColonnesimple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_id_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_Nom_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalGs1.g:600:2: ( (otherlv_0= 'Colonnesimple' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= 'Nom' otherlv_7= '=' ( (lv_Nom_8_0= RULE_STRING ) ) otherlv_9= '}' ) )
            // InternalGs1.g:601:2: (otherlv_0= 'Colonnesimple' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= 'Nom' otherlv_7= '=' ( (lv_Nom_8_0= RULE_STRING ) ) otherlv_9= '}' )
            {
            // InternalGs1.g:601:2: (otherlv_0= 'Colonnesimple' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= 'Nom' otherlv_7= '=' ( (lv_Nom_8_0= RULE_STRING ) ) otherlv_9= '}' )
            // InternalGs1.g:602:3: otherlv_0= 'Colonnesimple' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= 'Nom' otherlv_7= '=' ( (lv_Nom_8_0= RULE_STRING ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getColonnesimpleAccess().getColonnesimpleKeyword_0());
            		
            // InternalGs1.g:606:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGs1.g:607:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGs1.g:607:4: (lv_name_1_0= RULE_ID )
            // InternalGs1.g:608:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getColonnesimpleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColonnesimpleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getColonnesimpleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getColonnesimpleAccess().getIdKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getColonnesimpleAccess().getEqualsSignKeyword_4());
            		
            // InternalGs1.g:636:3: ( (lv_id_5_0= RULE_INT ) )
            // InternalGs1.g:637:4: (lv_id_5_0= RULE_INT )
            {
            // InternalGs1.g:637:4: (lv_id_5_0= RULE_INT )
            // InternalGs1.g:638:5: lv_id_5_0= RULE_INT
            {
            lv_id_5_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_id_5_0, grammarAccess.getColonnesimpleAccess().getIdINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColonnesimpleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getColonnesimpleAccess().getNomKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getColonnesimpleAccess().getEqualsSignKeyword_7());
            		
            // InternalGs1.g:662:3: ( (lv_Nom_8_0= RULE_STRING ) )
            // InternalGs1.g:663:4: (lv_Nom_8_0= RULE_STRING )
            {
            // InternalGs1.g:663:4: (lv_Nom_8_0= RULE_STRING )
            // InternalGs1.g:664:5: lv_Nom_8_0= RULE_STRING
            {
            lv_Nom_8_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_Nom_8_0, grammarAccess.getColonnesimpleAccess().getNomSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColonnesimpleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Nom",
            						lv_Nom_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getColonnesimpleAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColonnesimple"


    // $ANTLR start "entryRuleExpression"
    // InternalGs1.g:688:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalGs1.g:688:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalGs1.g:689:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalGs1.g:695:1: ruleExpression returns [EObject current=null] : (this_ExpressionBinaire_0= ruleExpressionBinaire | this_AccesVariable_1= ruleAccesVariable ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionBinaire_0 = null;

        EObject this_AccesVariable_1 = null;



        	enterRule();

        try {
            // InternalGs1.g:701:2: ( (this_ExpressionBinaire_0= ruleExpressionBinaire | this_AccesVariable_1= ruleAccesVariable ) )
            // InternalGs1.g:702:2: (this_ExpressionBinaire_0= ruleExpressionBinaire | this_AccesVariable_1= ruleAccesVariable )
            {
            // InternalGs1.g:702:2: (this_ExpressionBinaire_0= ruleExpressionBinaire | this_AccesVariable_1= ruleAccesVariable )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            else if ( (LA5_0==28) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGs1.g:703:3: this_ExpressionBinaire_0= ruleExpressionBinaire
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getExpressionBinaireParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpressionBinaire_0=ruleExpressionBinaire();

                    state._fsp--;


                    			current = this_ExpressionBinaire_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGs1.g:712:3: this_AccesVariable_1= ruleAccesVariable
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getAccesVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AccesVariable_1=ruleAccesVariable();

                    state._fsp--;


                    			current = this_AccesVariable_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleExpressionBinaire"
    // InternalGs1.g:724:1: entryRuleExpressionBinaire returns [EObject current=null] : iv_ruleExpressionBinaire= ruleExpressionBinaire EOF ;
    public final EObject entryRuleExpressionBinaire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionBinaire = null;


        try {
            // InternalGs1.g:724:58: (iv_ruleExpressionBinaire= ruleExpressionBinaire EOF )
            // InternalGs1.g:725:2: iv_ruleExpressionBinaire= ruleExpressionBinaire EOF
            {
             newCompositeNode(grammarAccess.getExpressionBinaireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionBinaire=ruleExpressionBinaire();

            state._fsp--;

             current =iv_ruleExpressionBinaire; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionBinaire"


    // $ANTLR start "ruleExpressionBinaire"
    // InternalGs1.g:731:1: ruleExpressionBinaire returns [EObject current=null] : (otherlv_0= 'ExpressionBinaire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'operandeG' otherlv_4= '=' ( (lv_operandeG_5_0= ruleExpression ) ) otherlv_6= 'operateur' otherlv_7= '=' ( (lv_operateur_8_0= ruleOperateur ) ) otherlv_9= 'operandeD' otherlv_10= '=' ( (lv_operandeD_11_0= ruleExpression ) ) otherlv_12= '}' ) ;
    public final EObject ruleExpressionBinaire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_operandeG_5_0 = null;

        EObject lv_operateur_8_0 = null;

        EObject lv_operandeD_11_0 = null;



        	enterRule();

        try {
            // InternalGs1.g:737:2: ( (otherlv_0= 'ExpressionBinaire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'operandeG' otherlv_4= '=' ( (lv_operandeG_5_0= ruleExpression ) ) otherlv_6= 'operateur' otherlv_7= '=' ( (lv_operateur_8_0= ruleOperateur ) ) otherlv_9= 'operandeD' otherlv_10= '=' ( (lv_operandeD_11_0= ruleExpression ) ) otherlv_12= '}' ) )
            // InternalGs1.g:738:2: (otherlv_0= 'ExpressionBinaire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'operandeG' otherlv_4= '=' ( (lv_operandeG_5_0= ruleExpression ) ) otherlv_6= 'operateur' otherlv_7= '=' ( (lv_operateur_8_0= ruleOperateur ) ) otherlv_9= 'operandeD' otherlv_10= '=' ( (lv_operandeD_11_0= ruleExpression ) ) otherlv_12= '}' )
            {
            // InternalGs1.g:738:2: (otherlv_0= 'ExpressionBinaire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'operandeG' otherlv_4= '=' ( (lv_operandeG_5_0= ruleExpression ) ) otherlv_6= 'operateur' otherlv_7= '=' ( (lv_operateur_8_0= ruleOperateur ) ) otherlv_9= 'operandeD' otherlv_10= '=' ( (lv_operandeD_11_0= ruleExpression ) ) otherlv_12= '}' )
            // InternalGs1.g:739:3: otherlv_0= 'ExpressionBinaire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'operandeG' otherlv_4= '=' ( (lv_operandeG_5_0= ruleExpression ) ) otherlv_6= 'operateur' otherlv_7= '=' ( (lv_operateur_8_0= ruleOperateur ) ) otherlv_9= 'operandeD' otherlv_10= '=' ( (lv_operandeD_11_0= ruleExpression ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getExpressionBinaireAccess().getExpressionBinaireKeyword_0());
            		
            // InternalGs1.g:743:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGs1.g:744:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGs1.g:744:4: (lv_name_1_0= RULE_ID )
            // InternalGs1.g:745:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExpressionBinaireAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpressionBinaireRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getExpressionBinaireAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getExpressionBinaireAccess().getOperandeGKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getExpressionBinaireAccess().getEqualsSignKeyword_4());
            		
            // InternalGs1.g:773:3: ( (lv_operandeG_5_0= ruleExpression ) )
            // InternalGs1.g:774:4: (lv_operandeG_5_0= ruleExpression )
            {
            // InternalGs1.g:774:4: (lv_operandeG_5_0= ruleExpression )
            // InternalGs1.g:775:5: lv_operandeG_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getExpressionBinaireAccess().getOperandeGExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_19);
            lv_operandeG_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionBinaireRule());
            					}
            					set(
            						current,
            						"operandeG",
            						lv_operandeG_5_0,
            						"fr.n7.Gs1.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getExpressionBinaireAccess().getOperateurKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getExpressionBinaireAccess().getEqualsSignKeyword_7());
            		
            // InternalGs1.g:800:3: ( (lv_operateur_8_0= ruleOperateur ) )
            // InternalGs1.g:801:4: (lv_operateur_8_0= ruleOperateur )
            {
            // InternalGs1.g:801:4: (lv_operateur_8_0= ruleOperateur )
            // InternalGs1.g:802:5: lv_operateur_8_0= ruleOperateur
            {

            					newCompositeNode(grammarAccess.getExpressionBinaireAccess().getOperateurOperateurParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_21);
            lv_operateur_8_0=ruleOperateur();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionBinaireRule());
            					}
            					set(
            						current,
            						"operateur",
            						lv_operateur_8_0,
            						"fr.n7.Gs1.Operateur");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getExpressionBinaireAccess().getOperandeDKeyword_9());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_10, grammarAccess.getExpressionBinaireAccess().getEqualsSignKeyword_10());
            		
            // InternalGs1.g:827:3: ( (lv_operandeD_11_0= ruleExpression ) )
            // InternalGs1.g:828:4: (lv_operandeD_11_0= ruleExpression )
            {
            // InternalGs1.g:828:4: (lv_operandeD_11_0= ruleExpression )
            // InternalGs1.g:829:5: lv_operandeD_11_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getExpressionBinaireAccess().getOperandeDExpressionParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_15);
            lv_operandeD_11_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionBinaireRule());
            					}
            					set(
            						current,
            						"operandeD",
            						lv_operandeD_11_0,
            						"fr.n7.Gs1.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getExpressionBinaireAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionBinaire"


    // $ANTLR start "entryRuleAccesVariable"
    // InternalGs1.g:854:1: entryRuleAccesVariable returns [EObject current=null] : iv_ruleAccesVariable= ruleAccesVariable EOF ;
    public final EObject entryRuleAccesVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccesVariable = null;


        try {
            // InternalGs1.g:854:54: (iv_ruleAccesVariable= ruleAccesVariable EOF )
            // InternalGs1.g:855:2: iv_ruleAccesVariable= ruleAccesVariable EOF
            {
             newCompositeNode(grammarAccess.getAccesVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccesVariable=ruleAccesVariable();

            state._fsp--;

             current =iv_ruleAccesVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAccesVariable"


    // $ANTLR start "ruleAccesVariable"
    // InternalGs1.g:861:1: ruleAccesVariable returns [EObject current=null] : (otherlv_0= 'AccesVariable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'colonne' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' ) ;
    public final EObject ruleAccesVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalGs1.g:867:2: ( (otherlv_0= 'AccesVariable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'colonne' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' ) )
            // InternalGs1.g:868:2: (otherlv_0= 'AccesVariable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'colonne' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' )
            {
            // InternalGs1.g:868:2: (otherlv_0= 'AccesVariable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'colonne' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' )
            // InternalGs1.g:869:3: otherlv_0= 'AccesVariable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'colonne' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAccesVariableAccess().getAccesVariableKeyword_0());
            		
            // InternalGs1.g:873:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGs1.g:874:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGs1.g:874:4: (lv_name_1_0= RULE_ID )
            // InternalGs1.g:875:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAccesVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAccesVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getAccesVariableAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getAccesVariableAccess().getColonneKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getAccesVariableAccess().getEqualsSignKeyword_4());
            		
            // InternalGs1.g:903:3: ( (otherlv_5= RULE_ID ) )
            // InternalGs1.g:904:4: (otherlv_5= RULE_ID )
            {
            // InternalGs1.g:904:4: (otherlv_5= RULE_ID )
            // InternalGs1.g:905:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAccesVariableRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_5, grammarAccess.getAccesVariableAccess().getColonneColonneCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAccesVariableAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAccesVariable"


    // $ANTLR start "entryRuleOperateur"
    // InternalGs1.g:924:1: entryRuleOperateur returns [EObject current=null] : iv_ruleOperateur= ruleOperateur EOF ;
    public final EObject entryRuleOperateur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperateur = null;


        try {
            // InternalGs1.g:924:50: (iv_ruleOperateur= ruleOperateur EOF )
            // InternalGs1.g:925:2: iv_ruleOperateur= ruleOperateur EOF
            {
             newCompositeNode(grammarAccess.getOperateurRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperateur=ruleOperateur();

            state._fsp--;

             current =iv_ruleOperateur; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperateur"


    // $ANTLR start "ruleOperateur"
    // InternalGs1.g:931:1: ruleOperateur returns [EObject current=null] : (otherlv_0= 'Operateur' otherlv_1= '{' otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleOperations ) ) otherlv_5= '}' ) ;
    public final EObject ruleOperateur() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalGs1.g:937:2: ( (otherlv_0= 'Operateur' otherlv_1= '{' otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleOperations ) ) otherlv_5= '}' ) )
            // InternalGs1.g:938:2: (otherlv_0= 'Operateur' otherlv_1= '{' otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleOperations ) ) otherlv_5= '}' )
            {
            // InternalGs1.g:938:2: (otherlv_0= 'Operateur' otherlv_1= '{' otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleOperations ) ) otherlv_5= '}' )
            // InternalGs1.g:939:3: otherlv_0= 'Operateur' otherlv_1= '{' otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleOperations ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOperateurAccess().getOperateurKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getOperateurAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getOperateurAccess().getTypeKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getOperateurAccess().getEqualsSignKeyword_3());
            		
            // InternalGs1.g:955:3: ( (lv_type_4_0= ruleOperations ) )
            // InternalGs1.g:956:4: (lv_type_4_0= ruleOperations )
            {
            // InternalGs1.g:956:4: (lv_type_4_0= ruleOperations )
            // InternalGs1.g:957:5: lv_type_4_0= ruleOperations
            {

            					newCompositeNode(grammarAccess.getOperateurAccess().getTypeOperationsEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_type_4_0=ruleOperations();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperateurRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"fr.n7.Gs1.Operations");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getOperateurAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperateur"


    // $ANTLR start "ruleOperations"
    // InternalGs1.g:982:1: ruleOperations returns [Enumerator current=null] : ( (enumLiteral_0= 'addition' ) | (enumLiteral_1= 'soustraction' ) | (enumLiteral_2= 'multiplication' ) | (enumLiteral_3= 'division' ) ) ;
    public final Enumerator ruleOperations() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalGs1.g:988:2: ( ( (enumLiteral_0= 'addition' ) | (enumLiteral_1= 'soustraction' ) | (enumLiteral_2= 'multiplication' ) | (enumLiteral_3= 'division' ) ) )
            // InternalGs1.g:989:2: ( (enumLiteral_0= 'addition' ) | (enumLiteral_1= 'soustraction' ) | (enumLiteral_2= 'multiplication' ) | (enumLiteral_3= 'division' ) )
            {
            // InternalGs1.g:989:2: ( (enumLiteral_0= 'addition' ) | (enumLiteral_1= 'soustraction' ) | (enumLiteral_2= 'multiplication' ) | (enumLiteral_3= 'division' ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt6=1;
                }
                break;
            case 32:
                {
                alt6=2;
                }
                break;
            case 33:
                {
                alt6=3;
                }
                break;
            case 34:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalGs1.g:990:3: (enumLiteral_0= 'addition' )
                    {
                    // InternalGs1.g:990:3: (enumLiteral_0= 'addition' )
                    // InternalGs1.g:991:4: enumLiteral_0= 'addition'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getOperationsAccess().getAdditionEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperationsAccess().getAdditionEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGs1.g:998:3: (enumLiteral_1= 'soustraction' )
                    {
                    // InternalGs1.g:998:3: (enumLiteral_1= 'soustraction' )
                    // InternalGs1.g:999:4: enumLiteral_1= 'soustraction'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getOperationsAccess().getSoustractionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperationsAccess().getSoustractionEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGs1.g:1006:3: (enumLiteral_2= 'multiplication' )
                    {
                    // InternalGs1.g:1006:3: (enumLiteral_2= 'multiplication' )
                    // InternalGs1.g:1007:4: enumLiteral_2= 'multiplication'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getOperationsAccess().getMultiplicationEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperationsAccess().getMultiplicationEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGs1.g:1014:3: (enumLiteral_3= 'division' )
                    {
                    // InternalGs1.g:1014:3: (enumLiteral_3= 'division' )
                    // InternalGs1.g:1015:4: enumLiteral_3= 'division'
                    {
                    enumLiteral_3=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getOperationsAccess().getDivisionEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOperationsAccess().getDivisionEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperations"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000942000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000780000000L});

}