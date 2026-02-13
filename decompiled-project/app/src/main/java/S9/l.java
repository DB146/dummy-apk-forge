package S9;

/* loaded from: classes2.dex */
public final class l extends M2.a {
    @Override // M2.a
    public final void a(U2.a database) {
        kotlin.jvm.internal.l.e(database, "database");
        database.o("CREATE TABLE IF NOT EXISTS `ExtensionsChannel_New` (`tvGroup` TEXT NOT NULL, `logoChannel` TEXT NOT NULL, `tvChannelName` TEXT NOT NULL, `tvStreamLink` TEXT NOT NULL, `sourceFrom` TEXT NOT NULL, `channelId` TEXT NOT NULL, `channelPreviewProviderId` INTEGER NOT NULL, `isHls` INTEGER NOT NULL, `catchupSource` TEXT NOT NULL, `userAgent` TEXT NOT NULL, `referer` TEXT NOT NULL, `props` TEXT, `extensionSourceId` TEXT NOT NULL, PRIMARY KEY(`channelId`, `tvStreamLink`))");
        database.o("INSERT INTO `ExtensionsChannel_New` (`tvGroup`, `logoChannel`, `tvChannelName`, `tvStreamLink`, `sourceFrom`, `channelId`, `channelPreviewProviderId`, `isHls`, `catchupSource`, `userAgent`, `referer`, `props`, `extensionSourceId`) SELECT `tvGroup`, `logoChannel`, `tvChannelName`, `tvStreamLink`, `sourceFrom`, `channelId`, `channelPreviewProviderId`, `isHls`, `catchupSource`, `userAgent`, `referer`, `props`, `extensionSourceId` FROM ExtensionsChannel");
        database.o("DROP TABLE ExtensionsChannel");
        database.o("ALTER TABLE ExtensionsChannel_New RENAME TO ExtensionsChannel");
    }
}
