package S9;

/* loaded from: classes2.dex */
public final class h extends M2.a {
    @Override // M2.a
    public final void a(U2.a database) {
        kotlin.jvm.internal.l.e(database, "database");
        database.o("CREATE TABLE IF NOT EXISTS `ExtensionsChannel` (`tvGroup` TEXT NOT NULL, `logoChannel` TEXT NOT NULL, `tvChannelName` TEXT NOT NULL, `tvStreamLink` TEXT NOT NULL, `sourceFrom` TEXT NOT NULL, `channelId` TEXT NOT NULL, `channelPreviewProviderId` INTEGER NOT NULL, `isHls` INTEGER NOT NULL, `catchupSource` TEXT NOT NULL, `userAgent` TEXT NOT NULL, `referer` TEXT NOT NULL, `props` TEXT NOT NULL, `extensionSourceId` TEXT NOT NULL, PRIMARY KEY(`channelId`))");
    }
}
