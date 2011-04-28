/************************************************************
 -----BEGIN PGP SIGNED MESSAGE-----
 Hash: SHA256
 
 *                 M O N E Y C H A N G E R
 *
 *   http://wiki.github.com/FellowTraveler/Moneychanger/wiki
 *
 *  Open Transactions:
 *       Financial Cryptography and Digital Cash
 *       Library, Protocol, API, Server, and GUI 
 *    
 *    	 -- Anonymous Numbered Accounts.
 *    	 -- Untraceable Digital Cash.
 *    	 -- Triple-Signed Receipts.
 *    	 -- Cheques, Vouchers, Transfers, Inboxes.
 *    	 -- Basket Currencies, Markets, Payment Plans.
 *    	 -- Signed, XML, Ricardian-style Contracts.
 *    
 *  Copyright (C) 2010-2011 by "Fellow Traveler" (A pseudonym)
 *
 *  EMAIL:
 *  FellowTraveler@rayservers.net --- SEE PGP KEY BELOW.
 *  F3llowTraveler@gmail.com --- (not preferred.)
 *  
 *  FINGERPRINT:
 *  9DD5 90EB 9292 4B48 0484  7910 0308 00ED F951 BB8E
 *
 *  BITCOIN:  1NtTPVVjDsUfDWybS4BwvHpG2pdS9RnYyQ
 *
 *  OFFICIAL PROJECT WIKI:
 *  http://wiki.github.com/FellowTraveler/Open-Transactions/wiki 
 *
 *  WEBSITE:
 *  http://www.OpenTransactions.org/
 *    
 *  Components and licensing:
 *   -- Moneychanger..A Java client GUI.....LICENSE:.....GPLv3
 *   -- OTLib.........A class library.......LICENSE:...LAGPLv3 
 *   -- OT-API........A client API..........LICENSE:...LAGPLv3
 *   -- testwallet....Command-line client...LICENSE:...LAGPLv3
 *   -- OT-Server.....Server Application....LICENSE:....AGPLv3
 *  Github.com/FellowTraveler/Open-Transactions/wiki/Components
 *
 *  All of the above OT components were designed and written by
 *  Fellow Traveler, with the exception of Moneychanger, which
 *  was contracted out to Vicky C (livewire_3001@yahoo.com).
 *
 *  -----------------------------------------------------
 *
 *   LICENSE:
 *   This program is free software: you can redistribute it
 *   and/or modify it under the terms of the GNU General
 *   Public License as published by the Free Software
 *   Foundation, either version 3 of the License, or (at your
 *   option) any later version.
 *
 *   You should have received a copy of the GNU General
 *   Public License along with this program.  If not, see:
 *   http://www.gnu.org/licenses/
 *
 *   If you would like to use this software outside of the free
 *   software license, please contact FellowTraveler.
 *   (Unfortunately many will run anonymously and untraceably,
 *   so who could really stop them?)
 *   
 *   DISCLAIMER:
 *   This program is distributed in the hope that it will be
 *   useful, but WITHOUT ANY WARRANTY; without even the implied
 *   warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 *   PURPOSE.  See the GNU General Public License for more
 *   details.
 
 -----BEGIN PGP SIGNATURE-----
 wsFVAwUBTbFZUwMIAO35UbuOAQjDRBAAmIUJBi5/WC1KpI4TNAWdQNh6g59qYS6w
 SI6mTMbnP0DUVOrmJdNR7/n1sRlnWzyjKLcKkRtXwRWGC+jE16jijxek9Ome5Qid
 bDqjHSuFvqnsD3+0tbENf+kVrbAReU3YvWk+xFvVc6I2NpS+lEIdjHIWm85jSmew
 Ydx+4KpELkO59thkcKgSYsTSyTP3l9GOTtJlq45XiamoEvso4jFUC1y5KMQsz1KH
 DTE32m5FPZqJqUw9loAmrni3dIMpXKC5yLhdqSMXHK0MAPEIexsuaZjrjKJQSjwV
 eDjwJcMn2WZVvcIr9IEoKEU/2j9wHNZv5Xuj78A/78AkjqEUwrY1M9ht0r/QbusW
 ZT7MlxNCq4DFstrjyKi03yZQGR+m8eJFHE7GvF8Vzg/ap0/CUJzeoXg5wACXGfJj
 k6y8ZBriQO08JECki2sy6oTitDoi7FmzgAIxPGB1qA4HMur/LuzrxAj2V7XkZQlk
 VfAda6Ff9bmStNut+zbsQ0pnIeL/URwWifI8Wq81c7DEIvA5SH/bU9Hws1FMO8PU
 BcDmzadU+syJBTxoP/mHZcLfwHDhcZyBeHX7sHfpHweEunzWjcHjqVCutQMO4dii
 yrsc64WTfAqd4s12SfKMgVFLeL/FUYH7MNqpfgjgwX5co817m9VvCntU6njIuYtV
 6+G/TuSViH8=
 =/jIC
 -----END PGP SIGNATURE-----
 **************************************************************/


package com.wrapper.core.jni;

public class otapi {
  public static int OT_API_Init(String szClientPath) {
    return otapiJNI.OT_API_Init(szClientPath);
  }
public static String OT_API_Wallet_ImportNym(String name,String key){
    return otapiJNI.OT_API_Wallet_ImportNym(name,key);
}
  public static int OT_API_LoadWallet(String szPath) {
    return otapiJNI.OT_API_LoadWallet(szPath);
  }

  public static int OT_API_SwitchWallet(String szDataFolderPath, String szWalletFilename) {
    return otapiJNI.OT_API_SwitchWallet(szDataFolderPath, szWalletFilename);
  }

  public static int OT_API_GetMemlogSize() {
    return otapiJNI.OT_API_GetMemlogSize();
  }

  public static String OT_API_GetMemlogAtIndex(int nIndex) {
    return otapiJNI.OT_API_GetMemlogAtIndex(nIndex);
  }

  public static String OT_API_PeekMemlogFront() {
    return otapiJNI.OT_API_PeekMemlogFront();
  }

  public static String OT_API_PeekMemlogBack() {
    return otapiJNI.OT_API_PeekMemlogBack();
  }

  public static int OT_API_PopMemlogFront() {
    return otapiJNI.OT_API_PopMemlogFront();
  }

  public static int OT_API_PopMemlogBack() {
    return otapiJNI.OT_API_PopMemlogBack();
  }

  public static String OT_API_CreateNym() {
    return otapiJNI.OT_API_CreateNym();
  }

  public static int OT_API_AddServerContract(String szContract) {
    return otapiJNI.OT_API_AddServerContract(szContract);
  }

  public static int OT_API_AddAssetContract(String szContract) {
    return otapiJNI.OT_API_AddAssetContract(szContract);
  }

  public static int OT_API_GetServerCount() {
    return otapiJNI.OT_API_GetServerCount();
  }

  public static int OT_API_GetAssetTypeCount() {
    return otapiJNI.OT_API_GetAssetTypeCount();
  }

  public static int OT_API_GetAccountCount() {
    return otapiJNI.OT_API_GetAccountCount();
  }

  public static int OT_API_GetNymCount() {
    return otapiJNI.OT_API_GetNymCount();
  }

  public static String OT_API_GetServer_ID(int nIndex) {
    return otapiJNI.OT_API_GetServer_ID(nIndex);
  }

  public static String OT_API_GetServer_Name(String SERVER_ID) {
    return otapiJNI.OT_API_GetServer_Name(SERVER_ID);
  }

  public static String OT_API_GetAssetType_ID(int nIndex) {
    return otapiJNI.OT_API_GetAssetType_ID(nIndex);
  }

  public static String OT_API_GetAssetType_Name(String ASSET_TYPE_ID) {
    return otapiJNI.OT_API_GetAssetType_Name(ASSET_TYPE_ID);
  }

  public static String OT_API_GetAccountWallet_ID(int nIndex) {
    return otapiJNI.OT_API_GetAccountWallet_ID(nIndex);
  }

  public static String OT_API_GetAccountWallet_Name(String ACCOUNT_ID) {
    return otapiJNI.OT_API_GetAccountWallet_Name(ACCOUNT_ID);
  }

  public static String OT_API_GetAccountWallet_Balance(String ACCOUNT_ID) {
    return otapiJNI.OT_API_GetAccountWallet_Balance(ACCOUNT_ID);
  }

  public static String OT_API_GetAccountWallet_Type(String ACCOUNT_ID) {
    return otapiJNI.OT_API_GetAccountWallet_Type(ACCOUNT_ID);
  }

  public static String OT_API_GetAccountWallet_AssetTypeID(String ACCOUNT_ID) {
    return otapiJNI.OT_API_GetAccountWallet_AssetTypeID(ACCOUNT_ID);
  }

  public static String OT_API_GetAccountWallet_ServerID(String ACCOUNT_ID) {
    return otapiJNI.OT_API_GetAccountWallet_ServerID(ACCOUNT_ID);
  }

  public static String OT_API_GetAccountWallet_NymID(String ACCOUNT_ID) {
    return otapiJNI.OT_API_GetAccountWallet_NymID(ACCOUNT_ID);
  }

  public static int OT_API_VerifyAccountReceipt(String SERVER_ID, String NYM_ID, String ACCT_ID) {
    return otapiJNI.OT_API_VerifyAccountReceipt(SERVER_ID, NYM_ID, ACCT_ID);
  }

  public static int OT_API_GetNym_TransactionNumCount(String SERVER_ID, String NYM_ID) {
    return otapiJNI.OT_API_GetNym_TransactionNumCount(SERVER_ID, NYM_ID);
  }

  public static String OT_API_GetNym_ID(int nIndex) {
    return otapiJNI.OT_API_GetNym_ID(nIndex);
  }

  public static String OT_API_GetNym_Name(String NYM_ID) {
    return otapiJNI.OT_API_GetNym_Name(NYM_ID);
  }

  public static String OT_API_GetNym_Stats(String NYM_ID) {
    return otapiJNI.OT_API_GetNym_Stats(NYM_ID);
  }

  public static int OT_API_IsNym_RegisteredAtServer(String NYM_ID, String SERVER_ID) {
    return otapiJNI.OT_API_IsNym_RegisteredAtServer(NYM_ID, SERVER_ID);
  }

  public static int OT_API_GetNym_MailCount(String NYM_ID) {
    return otapiJNI.OT_API_GetNym_MailCount(NYM_ID);
  }

  public static String OT_API_GetNym_MailContentsByIndex(String NYM_ID, int nIndex) {
    return otapiJNI.OT_API_GetNym_MailContentsByIndex(NYM_ID, nIndex);
  }

  public static String OT_API_GetNym_MailSenderIDByIndex(String NYM_ID, int nIndex) {
    return otapiJNI.OT_API_GetNym_MailSenderIDByIndex(NYM_ID, nIndex);
  }

  public static String OT_API_GetNym_MailServerIDByIndex(String NYM_ID, int nIndex) {
    return otapiJNI.OT_API_GetNym_MailServerIDByIndex(NYM_ID, nIndex);
  }

  public static int OT_API_Nym_RemoveMailByIndex(String NYM_ID, int nIndex) {
    return otapiJNI.OT_API_Nym_RemoveMailByIndex(NYM_ID, nIndex);
  }

  public static int OT_API_Nym_VerifyMailByIndex(String NYM_ID, int nIndex) {
    return otapiJNI.OT_API_Nym_VerifyMailByIndex(NYM_ID, nIndex);
  }

  public static int OT_API_GetNym_OutmailCount(String NYM_ID) {
    return otapiJNI.OT_API_GetNym_OutmailCount(NYM_ID);
  }

  public static String OT_API_GetNym_OutmailContentsByIndex(String NYM_ID, int nIndex) {
    return otapiJNI.OT_API_GetNym_OutmailContentsByIndex(NYM_ID, nIndex);
  }

  public static String OT_API_GetNym_OutmailRecipientIDByIndex(String NYM_ID, int nIndex) {
    return otapiJNI.OT_API_GetNym_OutmailRecipientIDByIndex(NYM_ID, nIndex);
  }

  public static String OT_API_GetNym_OutmailServerIDByIndex(String NYM_ID, int nIndex) {
    return otapiJNI.OT_API_GetNym_OutmailServerIDByIndex(NYM_ID, nIndex);
  }

  public static int OT_API_Nym_RemoveOutmailByIndex(String NYM_ID, int nIndex) {
    return otapiJNI.OT_API_Nym_RemoveOutmailByIndex(NYM_ID, nIndex);
  }

  public static int OT_API_Nym_VerifyOutmailByIndex(String NYM_ID, int nIndex) {
    return otapiJNI.OT_API_Nym_VerifyOutmailByIndex(NYM_ID, nIndex);
  }

  public static int OT_API_Wallet_CanRemoveServer(String SERVER_ID) {
    return otapiJNI.OT_API_Wallet_CanRemoveServer(SERVER_ID);
  }

  public static int OT_API_Wallet_RemoveServer(String SERVER_ID) {
    return otapiJNI.OT_API_Wallet_RemoveServer(SERVER_ID);
  }

  public static int OT_API_Wallet_CanRemoveAssetType(String ASSET_ID) {
    return otapiJNI.OT_API_Wallet_CanRemoveAssetType(ASSET_ID);
  }

  public static int OT_API_Wallet_RemoveAssetType(String ASSET_ID) {
    return otapiJNI.OT_API_Wallet_RemoveAssetType(ASSET_ID);
  }

  public static int OT_API_Wallet_CanRemoveNym(String NYM_ID) {
    return otapiJNI.OT_API_Wallet_CanRemoveNym(NYM_ID);
  }

  public static int OT_API_Wallet_RemoveNym(String NYM_ID) {
    return otapiJNI.OT_API_Wallet_RemoveNym(NYM_ID);
  }

  public static int OT_API_Wallet_CanRemoveAccount(String ACCOUNT_ID) {
    return otapiJNI.OT_API_Wallet_CanRemoveAccount(ACCOUNT_ID);
  }

  public static int OT_API_Wallet_RemoveAccount(String ACCOUNT_ID) {
    return otapiJNI.OT_API_Wallet_RemoveAccount(ACCOUNT_ID);
  }

  public static int OT_API_SetNym_Name(String NYM_ID, String SIGNER_NYM_ID, String NYM_NEW_NAME) {
    return otapiJNI.OT_API_SetNym_Name(NYM_ID, SIGNER_NYM_ID, NYM_NEW_NAME);
  }

  public static int OT_API_SetAccountWallet_Name(String ACCT_ID, String SIGNER_NYM_ID, String ACCT_NEW_NAME) {
    return otapiJNI.OT_API_SetAccountWallet_Name(ACCT_ID, SIGNER_NYM_ID, ACCT_NEW_NAME);
  }

  public static int OT_API_SetAssetType_Name(String ASSET_ID, String STR_NEW_NAME) {
    return otapiJNI.OT_API_SetAssetType_Name(ASSET_ID, STR_NEW_NAME);
  }

  public static int OT_API_SetServer_Name(String SERVER_ID, String STR_NEW_NAME) {
    return otapiJNI.OT_API_SetServer_Name(SERVER_ID, STR_NEW_NAME);
  }

  public static String OT_API_VerifyAndRetrieveXMLContents(String THE_CONTRACT, String USER_ID) {
    return otapiJNI.OT_API_VerifyAndRetrieveXMLContents(THE_CONTRACT, USER_ID);
  }

  public static String OT_API_WriteCheque(String SERVER_ID, String CHEQUE_AMOUNT, String VALID_FROM, String VALID_TO, String SENDER_ACCT_ID, String SENDER_USER_ID, String CHEQUE_MEMO, String RECIPIENT_USER_ID) {
    return otapiJNI.OT_API_WriteCheque(SERVER_ID, CHEQUE_AMOUNT, VALID_FROM, VALID_TO, SENDER_ACCT_ID, SENDER_USER_ID, CHEQUE_MEMO, RECIPIENT_USER_ID);
  }

  public static String OT_API_WritePaymentPlan(String SERVER_ID, String VALID_FROM, String VALID_TO, String SENDER_ACCT_ID, String SENDER_USER_ID, String PLAN_CONSIDERATION, String RECIPIENT_ACCT_ID, String RECIPIENT_USER_ID, String INITIAL_PAYMENT_AMOUNT, String INITIAL_PAYMENT_DELAY, String PAYMENT_PLAN_AMOUNT, String PAYMENT_PLAN_DELAY, String PAYMENT_PLAN_PERIOD, String PAYMENT_PLAN_LENGTH, String PAYMENT_PLAN_MAX_PAYMENTS) {
    return otapiJNI.OT_API_WritePaymentPlan(SERVER_ID, VALID_FROM, VALID_TO, SENDER_ACCT_ID, SENDER_USER_ID, PLAN_CONSIDERATION, RECIPIENT_ACCT_ID, RECIPIENT_USER_ID, INITIAL_PAYMENT_AMOUNT, INITIAL_PAYMENT_DELAY, PAYMENT_PLAN_AMOUNT, PAYMENT_PLAN_DELAY, PAYMENT_PLAN_PERIOD, PAYMENT_PLAN_LENGTH, PAYMENT_PLAN_MAX_PAYMENTS);
  }

  public static String OT_API_LoadUserPubkey(String USER_ID) {
    return otapiJNI.OT_API_LoadUserPubkey(USER_ID);
  }

  public static String OT_API_LoadPubkey(String USER_ID) {
    return otapiJNI.OT_API_LoadPubkey(USER_ID);
  }

  public static int OT_API_VerifyUserPrivateKey(String USER_ID) {
    return otapiJNI.OT_API_VerifyUserPrivateKey(USER_ID);
  }

  public static String OT_API_LoadPurse(String SERVER_ID, String ASSET_TYPE_ID, String USER_ID) {
    return otapiJNI.OT_API_LoadPurse(SERVER_ID, ASSET_TYPE_ID, USER_ID);
  }

  public static String OT_API_LoadMint(String SERVER_ID, String ASSET_TYPE_ID) {
    return otapiJNI.OT_API_LoadMint(SERVER_ID, ASSET_TYPE_ID);
  }

  public static String OT_API_LoadAssetContract(String ASSET_TYPE_ID) {
    return otapiJNI.OT_API_LoadAssetContract(ASSET_TYPE_ID);
  }

  public static String OT_API_LoadServerContract(String SERVER_ID) {
    return otapiJNI.OT_API_LoadServerContract(SERVER_ID);
  }

  public static int OT_API_IsBasketCurrency(String ASSET_TYPE_ID) {
    return otapiJNI.OT_API_IsBasketCurrency(ASSET_TYPE_ID);
  }

  public static int OT_API_Basket_GetMemberCount(String BASKET_ASSET_TYPE_ID) {
    return otapiJNI.OT_API_Basket_GetMemberCount(BASKET_ASSET_TYPE_ID);
  }

  public static String OT_API_Basket_GetMemberType(String BASKET_ASSET_TYPE_ID, int nIndex) {
    return otapiJNI.OT_API_Basket_GetMemberType(BASKET_ASSET_TYPE_ID, nIndex);
  }

  public static String OT_API_Basket_GetMinimumTransferAmount(String BASKET_ASSET_TYPE_ID) {
    return otapiJNI.OT_API_Basket_GetMinimumTransferAmount(BASKET_ASSET_TYPE_ID);
  }

  public static String OT_API_Basket_GetMemberMinimumTransferAmount(String BASKET_ASSET_TYPE_ID, int nIndex) {
    return otapiJNI.OT_API_Basket_GetMemberMinimumTransferAmount(BASKET_ASSET_TYPE_ID, nIndex);
  }

  public static String OT_API_LoadAssetAccount(String SERVER_ID, String USER_ID, String ACCOUNT_ID) {
    return otapiJNI.OT_API_LoadAssetAccount(SERVER_ID, USER_ID, ACCOUNT_ID);
  }

  public static String OT_API_LoadInbox(String SERVER_ID, String USER_ID, String ACCOUNT_ID) {
    return otapiJNI.OT_API_LoadInbox(SERVER_ID, USER_ID, ACCOUNT_ID);
  }

  public static String OT_API_LoadOutbox(String SERVER_ID, String USER_ID, String ACCOUNT_ID) {
    return otapiJNI.OT_API_LoadOutbox(SERVER_ID, USER_ID, ACCOUNT_ID);
  }

  public static int OT_API_Ledger_GetCount(String SERVER_ID, String USER_ID, String ACCOUNT_ID, String THE_LEDGER) {
    return otapiJNI.OT_API_Ledger_GetCount(SERVER_ID, USER_ID, ACCOUNT_ID, THE_LEDGER);
  }

  public static String OT_API_Ledger_CreateResponse(String SERVER_ID, String USER_ID, String ACCOUNT_ID, String ORIGINAL_LEDGER) {
    return otapiJNI.OT_API_Ledger_CreateResponse(SERVER_ID, USER_ID, ACCOUNT_ID, ORIGINAL_LEDGER);
  }

  public static String OT_API_Ledger_GetTransactionByIndex(String SERVER_ID, String USER_ID, String ACCOUNT_ID, String THE_LEDGER, int nIndex) {
    return otapiJNI.OT_API_Ledger_GetTransactionByIndex(SERVER_ID, USER_ID, ACCOUNT_ID, THE_LEDGER, nIndex);
  }

  public static String OT_API_Ledger_GetTransactionByID(String SERVER_ID, String USER_ID, String ACCOUNT_ID, String THE_LEDGER, String TRANSACTION_NUMBER) {
    return otapiJNI.OT_API_Ledger_GetTransactionByID(SERVER_ID, USER_ID, ACCOUNT_ID, THE_LEDGER, TRANSACTION_NUMBER);
  }

  public static String OT_API_Ledger_GetTransactionIDByIndex(String SERVER_ID, String USER_ID, String ACCOUNT_ID, String THE_LEDGER, int nIndex) {
    return otapiJNI.OT_API_Ledger_GetTransactionIDByIndex(SERVER_ID, USER_ID, ACCOUNT_ID, THE_LEDGER, nIndex);
  }

  public static String OT_API_Ledger_AddTransaction(String SERVER_ID, String USER_ID, String ACCOUNT_ID, String THE_LEDGER, String THE_TRANSACTION) {
    return otapiJNI.OT_API_Ledger_AddTransaction(SERVER_ID, USER_ID, ACCOUNT_ID, THE_LEDGER, THE_TRANSACTION);
  }

  public static String OT_API_Transaction_CreateResponse(String SERVER_ID, String USER_ID, String ACCOUNT_ID, String RESPONSE_LEDGER, String ORIGINAL_TRANSACTION, int BOOL_DO_I_ACCEPT) {
    return otapiJNI.OT_API_Transaction_CreateResponse(SERVER_ID, USER_ID, ACCOUNT_ID, RESPONSE_LEDGER, ORIGINAL_TRANSACTION, BOOL_DO_I_ACCEPT);
  }

  public static String OT_API_Ledger_FinalizeResponse(String SERVER_ID, String USER_ID, String ACCOUNT_ID, String THE_LEDGER) {
    return otapiJNI.OT_API_Ledger_FinalizeResponse(SERVER_ID, USER_ID, ACCOUNT_ID, THE_LEDGER);
  }

  public static String OT_API_Transaction_GetType(String SERVER_ID, String USER_ID, String ACCOUNT_ID, String THE_TRANSACTION) {
    return otapiJNI.OT_API_Transaction_GetType(SERVER_ID, USER_ID, ACCOUNT_ID, THE_TRANSACTION);
  }

  public static String OT_API_Transaction_GetVoucher(String SERVER_ID, String USER_ID, String ACCOUNT_ID, String THE_TRANSACTION) {
    return otapiJNI.OT_API_Transaction_GetVoucher(SERVER_ID, USER_ID, ACCOUNT_ID, THE_TRANSACTION);
  }

  public static int OT_API_Transaction_GetSuccess(String SERVER_ID, String USER_ID, String ACCOUNT_ID, String THE_TRANSACTION) {
    return otapiJNI.OT_API_Transaction_GetSuccess(SERVER_ID, USER_ID, ACCOUNT_ID, THE_TRANSACTION);
  }

  public static String OT_API_Transaction_GetDateSigned(String SERVER_ID, String USER_ID, String ACCOUNT_ID, String THE_TRANSACTION) {
    return otapiJNI.OT_API_Transaction_GetDateSigned(SERVER_ID, USER_ID, ACCOUNT_ID, THE_TRANSACTION);
  }

  public static String OT_API_Transaction_GetAmount(String SERVER_ID, String USER_ID, String ACCOUNT_ID, String THE_TRANSACTION) {
    return otapiJNI.OT_API_Transaction_GetAmount(SERVER_ID, USER_ID, ACCOUNT_ID, THE_TRANSACTION);
  }

  public static String OT_API_Pending_GetNote(String SERVER_ID, String USER_ID, String ACCOUNT_ID, String THE_TRANSACTION) {
    return otapiJNI.OT_API_Pending_GetNote(SERVER_ID, USER_ID, ACCOUNT_ID, THE_TRANSACTION);
  }

  public static String OT_API_Transaction_GetSenderUserID(String SERVER_ID, String USER_ID, String ACCOUNT_ID, String THE_TRANSACTION) {
    return otapiJNI.OT_API_Transaction_GetSenderUserID(SERVER_ID, USER_ID, ACCOUNT_ID, THE_TRANSACTION);
  }

  public static String OT_API_Transaction_GetSenderAcctID(String SERVER_ID, String USER_ID, String ACCOUNT_ID, String THE_TRANSACTION) {
    return otapiJNI.OT_API_Transaction_GetSenderAcctID(SERVER_ID, USER_ID, ACCOUNT_ID, THE_TRANSACTION);
  }

  public static String OT_API_Transaction_GetRecipientUserID(String SERVER_ID, String USER_ID, String ACCOUNT_ID, String THE_TRANSACTION) {
    return otapiJNI.OT_API_Transaction_GetRecipientUserID(SERVER_ID, USER_ID, ACCOUNT_ID, THE_TRANSACTION);
  }

  public static String OT_API_Transaction_GetRecipientAcctID(String SERVER_ID, String USER_ID, String ACCOUNT_ID, String THE_TRANSACTION) {
    return otapiJNI.OT_API_Transaction_GetRecipientAcctID(SERVER_ID, USER_ID, ACCOUNT_ID, THE_TRANSACTION);
  }

  public static String OT_API_Transaction_GetDisplayReferenceToNum(String SERVER_ID, String USER_ID, String ACCOUNT_ID, String THE_TRANSACTION) {
    return otapiJNI.OT_API_Transaction_GetDisplayReferenceToNum(SERVER_ID, USER_ID, ACCOUNT_ID, THE_TRANSACTION);
  }

  public static String OT_API_CreatePurse(String SERVER_ID, String ASSET_TYPE_ID, String USER_ID) {
    return otapiJNI.OT_API_CreatePurse(SERVER_ID, ASSET_TYPE_ID, USER_ID);
  }

  public static int OT_API_SavePurse(String SERVER_ID, String ASSET_TYPE_ID, String USER_ID, String THE_PURSE) {
    return otapiJNI.OT_API_SavePurse(SERVER_ID, ASSET_TYPE_ID, USER_ID, THE_PURSE);
  }

  public static String OT_API_Purse_GetTotalValue(String SERVER_ID, String ASSET_TYPE_ID, String THE_PURSE) {
    return otapiJNI.OT_API_Purse_GetTotalValue(SERVER_ID, ASSET_TYPE_ID, THE_PURSE);
  }

  public static int OT_API_Purse_Count(String SERVER_ID, String ASSET_TYPE_ID, String THE_PURSE) {
    return otapiJNI.OT_API_Purse_Count(SERVER_ID, ASSET_TYPE_ID, THE_PURSE);
  }

  public static String OT_API_Purse_Peek(String SERVER_ID, String ASSET_TYPE_ID, String USER_ID, String THE_PURSE) {
    return otapiJNI.OT_API_Purse_Peek(SERVER_ID, ASSET_TYPE_ID, USER_ID, THE_PURSE);
  }

  public static String OT_API_Purse_Pop(String SERVER_ID, String ASSET_TYPE_ID, String USER_ID, String THE_PURSE) {
    return otapiJNI.OT_API_Purse_Pop(SERVER_ID, ASSET_TYPE_ID, USER_ID, THE_PURSE);
  }

  public static String OT_API_Purse_Push(String SERVER_ID, String ASSET_TYPE_ID, String USER_ID, String THE_PURSE, String THE_TOKEN) {
    return otapiJNI.OT_API_Purse_Push(SERVER_ID, ASSET_TYPE_ID, USER_ID, THE_PURSE, THE_TOKEN);
  }

  public static int OT_API_Wallet_ImportPurse(String SERVER_ID, String ASSET_TYPE_ID, String USER_ID, String THE_PURSE) {
    return otapiJNI.OT_API_Wallet_ImportPurse(SERVER_ID, ASSET_TYPE_ID, USER_ID, THE_PURSE);
  }

  public static void OT_API_exchangePurse(String SERVER_ID, String ASSET_TYPE_ID, String USER_ID, String THE_PURSE) {
    otapiJNI.OT_API_exchangePurse(SERVER_ID, ASSET_TYPE_ID, USER_ID, THE_PURSE);
  }

  public static String OT_API_Token_ChangeOwner(String SERVER_ID, String ASSET_TYPE_ID, String THE_TOKEN, String OLD_OWNER_NYM_ID, String NEW_OWNER_NYM_ID) {
    return otapiJNI.OT_API_Token_ChangeOwner(SERVER_ID, ASSET_TYPE_ID, THE_TOKEN, OLD_OWNER_NYM_ID, NEW_OWNER_NYM_ID);
  }

  public static String OT_API_Token_GetID(String SERVER_ID, String ASSET_TYPE_ID, String THE_TOKEN) {
    return otapiJNI.OT_API_Token_GetID(SERVER_ID, ASSET_TYPE_ID, THE_TOKEN);
  }

  public static String OT_API_Token_GetDenomination(String SERVER_ID, String ASSET_TYPE_ID, String THE_TOKEN) {
    return otapiJNI.OT_API_Token_GetDenomination(SERVER_ID, ASSET_TYPE_ID, THE_TOKEN);
  }

  public static int OT_API_Token_GetSeries(String SERVER_ID, String ASSET_TYPE_ID, String THE_TOKEN) {
    return otapiJNI.OT_API_Token_GetSeries(SERVER_ID, ASSET_TYPE_ID, THE_TOKEN);
  }

  public static String OT_API_Token_GetValidFrom(String SERVER_ID, String ASSET_TYPE_ID, String THE_TOKEN) {
    return otapiJNI.OT_API_Token_GetValidFrom(SERVER_ID, ASSET_TYPE_ID, THE_TOKEN);
  }

  public static String OT_API_Token_GetValidTo(String SERVER_ID, String ASSET_TYPE_ID, String THE_TOKEN) {
    return otapiJNI.OT_API_Token_GetValidTo(SERVER_ID, ASSET_TYPE_ID, THE_TOKEN);
  }

  public static String OT_API_Token_GetAssetID(String THE_TOKEN) {
    return otapiJNI.OT_API_Token_GetAssetID(THE_TOKEN);
  }

  public static String OT_API_Token_GetServerID(String THE_TOKEN) {
    return otapiJNI.OT_API_Token_GetServerID(THE_TOKEN);
  }

  public static void OT_API_checkServerID(String SERVER_ID, String USER_ID) {
    otapiJNI.OT_API_checkServerID(SERVER_ID, USER_ID);
  }

  public static void OT_API_createUserAccount(String SERVER_ID, String USER_ID) {
    otapiJNI.OT_API_createUserAccount(SERVER_ID, USER_ID);
  }

  public static void OT_API_checkUser(String SERVER_ID, String USER_ID, String USER_ID_CHECK) {
    otapiJNI.OT_API_checkUser(SERVER_ID, USER_ID, USER_ID_CHECK);
  }

  public static void OT_API_sendUserMessage(String SERVER_ID, String USER_ID, String USER_ID_RECIPIENT, String RECIPIENT_PUBKEY, String THE_MESSAGE) {
    otapiJNI.OT_API_sendUserMessage(SERVER_ID, USER_ID, USER_ID_RECIPIENT, RECIPIENT_PUBKEY, THE_MESSAGE);
  }

  public static void OT_API_getRequest(String SERVER_ID, String USER_ID) {
    otapiJNI.OT_API_getRequest(SERVER_ID, USER_ID);
  }

  public static void OT_API_getTransactionNumber(String SERVER_ID, String USER_ID) {
    otapiJNI.OT_API_getTransactionNumber(SERVER_ID, USER_ID);
  }

  public static void OT_API_issueAssetType(String SERVER_ID, String USER_ID, String THE_CONTRACT) {
    otapiJNI.OT_API_issueAssetType(SERVER_ID, USER_ID, THE_CONTRACT);
  }

  public static void OT_API_getContract(String SERVER_ID, String USER_ID, String ASSET_ID) {
    otapiJNI.OT_API_getContract(SERVER_ID, USER_ID, ASSET_ID);
  }

  public static void OT_API_getMint(String SERVER_ID, String USER_ID, String ASSET_ID) {
    otapiJNI.OT_API_getMint(SERVER_ID, USER_ID, ASSET_ID);
  }

  public static void OT_API_createAssetAccount(String SERVER_ID, String USER_ID, String ASSET_ID) {
    otapiJNI.OT_API_createAssetAccount(SERVER_ID, USER_ID, ASSET_ID);
  }

  public static void OT_API_getAccount(String SERVER_ID, String USER_ID, String ACCT_ID) {
    otapiJNI.OT_API_getAccount(SERVER_ID, USER_ID, ACCT_ID);
  }

  public static String OT_API_GenerateBasketCreation(String USER_ID, String MINIMUM_TRANSFER) {
    return otapiJNI.OT_API_GenerateBasketCreation(USER_ID, MINIMUM_TRANSFER);
  }

  public static String OT_API_AddBasketCreationItem(String USER_ID, String THE_BASKET, String ASSET_TYPE_ID, String MINIMUM_TRANSFER) {
    return otapiJNI.OT_API_AddBasketCreationItem(USER_ID, THE_BASKET, ASSET_TYPE_ID, MINIMUM_TRANSFER);
  }

  public static void OT_API_issueBasket(String SERVER_ID, String USER_ID, String THE_BASKET) {
    otapiJNI.OT_API_issueBasket(SERVER_ID, USER_ID, THE_BASKET);
  }

  public static String OT_API_GenerateBasketExchange(String SERVER_ID, String USER_ID, String BASKET_ASSET_TYPE_ID, String BASKET_ASSET_ACCT_ID, int TRANSFER_MULTIPLE) {
    return otapiJNI.OT_API_GenerateBasketExchange(SERVER_ID, USER_ID, BASKET_ASSET_TYPE_ID, BASKET_ASSET_ACCT_ID, TRANSFER_MULTIPLE);
  }

  public static String OT_API_AddBasketExchangeItem(String SERVER_ID, String USER_ID, String THE_BASKET, String ASSET_TYPE_ID, String ASSET_ACCT_ID) {
    return otapiJNI.OT_API_AddBasketExchangeItem(SERVER_ID, USER_ID, THE_BASKET, ASSET_TYPE_ID, ASSET_ACCT_ID);
  }

  public static void OT_API_exchangeBasket(String SERVER_ID, String USER_ID, String BASKET_ASSET_ID, String THE_BASKET, int BOOL_EXCHANGE_IN_OR_OUT) {
    otapiJNI.OT_API_exchangeBasket(SERVER_ID, USER_ID, BASKET_ASSET_ID, THE_BASKET, BOOL_EXCHANGE_IN_OR_OUT);
  }

  public static void OT_API_notarizeWithdrawal(String SERVER_ID, String USER_ID, String ACCT_ID, String AMOUNT) {
    otapiJNI.OT_API_notarizeWithdrawal(SERVER_ID, USER_ID, ACCT_ID, AMOUNT);
  }

  public static void OT_API_notarizeDeposit(String SERVER_ID, String USER_ID, String ACCT_ID, String THE_PURSE) {
    otapiJNI.OT_API_notarizeDeposit(SERVER_ID, USER_ID, ACCT_ID, THE_PURSE);
  }

  public static void OT_API_notarizeTransfer(String SERVER_ID, String USER_ID, String ACCT_FROM, String ACCT_TO, String AMOUNT, String NOTE) {
    otapiJNI.OT_API_notarizeTransfer(SERVER_ID, USER_ID, ACCT_FROM, ACCT_TO, AMOUNT, NOTE);
  }

  public static void OT_API_getInbox(String SERVER_ID, String USER_ID, String ACCT_ID) {
    otapiJNI.OT_API_getInbox(SERVER_ID, USER_ID, ACCT_ID);
  }

  public static void OT_API_getOutbox(String SERVER_ID, String USER_ID, String ACCT_ID) {
    otapiJNI.OT_API_getOutbox(SERVER_ID, USER_ID, ACCT_ID);
  }

  public static void OT_API_getNymbox(String SERVER_ID, String USER_ID) {
    otapiJNI.OT_API_getNymbox(SERVER_ID, USER_ID);
  }

  public static String OT_API_LoadNymbox(String SERVER_ID, String USER_ID) {
    return otapiJNI.OT_API_LoadNymbox(SERVER_ID, USER_ID);
  }

  public static void OT_API_processInbox(String SERVER_ID, String USER_ID, String ACCT_ID, String ACCT_LEDGER) {
    otapiJNI.OT_API_processInbox(SERVER_ID, USER_ID, ACCT_ID, ACCT_LEDGER);
  }

  public static void OT_API_processNymbox(String SERVER_ID, String USER_ID, String ACCT_LEDGER) {
    otapiJNI.OT_API_processNymbox(SERVER_ID, USER_ID, ACCT_LEDGER);
  }

  public static void OT_API_withdrawVoucher(String SERVER_ID, String USER_ID, String ACCT_ID, String RECIPIENT_USER_ID, String CHEQUE_MEMO, String AMOUNT) {
    otapiJNI.OT_API_withdrawVoucher(SERVER_ID, USER_ID, ACCT_ID, RECIPIENT_USER_ID, CHEQUE_MEMO, AMOUNT);
  }

  public static void OT_API_depositCheque(String SERVER_ID, String USER_ID, String ACCT_ID, String THE_CHEQUE) {
    otapiJNI.OT_API_depositCheque(SERVER_ID, USER_ID, ACCT_ID, THE_CHEQUE);
  }

  public static void OT_API_depositPaymentPlan(String SERVER_ID, String USER_ID, String THE_PAYMENT_PLAN) {
    otapiJNI.OT_API_depositPaymentPlan(SERVER_ID, USER_ID, THE_PAYMENT_PLAN);
  }

  public static void OT_API_issueMarketOffer(String SERVER_ID, String USER_ID, String ASSET_TYPE_ID, String ASSET_ACCT_ID, String CURRENCY_TYPE_ID, String CURRENCY_ACCT_ID, String MARKET_SCALE, String MINIMUM_INCREMENT, String TOTAL_ASSETS_ON_OFFER, String PRICE_LIMIT, int bBuyingOrSelling) {
    otapiJNI.OT_API_issueMarketOffer(SERVER_ID, USER_ID, ASSET_TYPE_ID, ASSET_ACCT_ID, CURRENCY_TYPE_ID, CURRENCY_ACCT_ID, MARKET_SCALE, MINIMUM_INCREMENT, TOTAL_ASSETS_ON_OFFER, PRICE_LIMIT, bBuyingOrSelling);
  }

  public static String OT_API_PopMessageBuffer() {
    return otapiJNI.OT_API_PopMessageBuffer();
  }

  public static void OT_API_FlushMessageBuffer() {
    otapiJNI.OT_API_FlushMessageBuffer();
  }

  public static String OT_API_Message_GetCommand(String THE_MESSAGE) {
    return otapiJNI.OT_API_Message_GetCommand(THE_MESSAGE);
  }

  public static int OT_API_Message_GetSuccess(String THE_MESSAGE) {
    return otapiJNI.OT_API_Message_GetSuccess(THE_MESSAGE);
  }

  public static int OT_API_Message_GetTransactionSuccess(String SERVER_ID, String USER_ID, String ACCOUNT_ID, String THE_MESSAGE) {
    return otapiJNI.OT_API_Message_GetTransactionSuccess(SERVER_ID, USER_ID, ACCOUNT_ID, THE_MESSAGE);
  }

  public static String OT_API_Message_GetLedger(String THE_MESSAGE) {
    return otapiJNI.OT_API_Message_GetLedger(THE_MESSAGE);
  }

  public static String OT_API_Message_GetNewAssetTypeID(String THE_MESSAGE) {
    return otapiJNI.OT_API_Message_GetNewAssetTypeID(THE_MESSAGE);
  }

  public static String OT_API_Message_GetNewIssuerAcctID(String THE_MESSAGE) {
    return otapiJNI.OT_API_Message_GetNewIssuerAcctID(THE_MESSAGE);
  }

  public static String OT_API_Message_GetNewAcctID(String THE_MESSAGE) {
    return otapiJNI.OT_API_Message_GetNewAcctID(THE_MESSAGE);
  }

  public static int OT_API_ConnectServer(String SERVER_ID, String USER_ID, String szCA_FILE, String szKEY_FILE, String szKEY_PASSWORD) {
    return otapiJNI.OT_API_ConnectServer(SERVER_ID, USER_ID, szCA_FILE, szKEY_FILE, szKEY_PASSWORD);
  }

  public static int OT_API_ProcessSockets() {
    return otapiJNI.OT_API_ProcessSockets();
  }

}
