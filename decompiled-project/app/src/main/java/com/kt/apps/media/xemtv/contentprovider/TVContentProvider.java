package com.kt.apps.media.xemtv.contentprovider;

import Eb.o;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class TVContentProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        l.e(uri, "uri");
        throw new Error("An operation is not implemented: Not yet implemented");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        l.e(uri, "uri");
        throw new Error("An operation is not implemented: Not yet implemented");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        l.e(uri, "uri");
        throw new Error("An operation is not implemented: Not yet implemented");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        l.e(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        l.d(pathSegments, "getPathSegments(...)");
        if (l.a(o.Z(pathSegments), "search")) {
            String message = "Handling query for " + uri + " " + ((strArr2 == null || strArr2.length == 0) ? null : strArr2[0]);
            l.e(message, "message");
        } else {
            List<String> pathSegments2 = uri.getPathSegments();
            l.d(pathSegments2, "getPathSegments(...)");
            if (!l.a(o.e0(pathSegments2), "search_suggest_query")) {
                throw new IllegalArgumentException("Invalid URI: " + uri);
            }
            String message2 = "Handling query for " + uri + " " + str + " " + str2 + " " + strArr2;
            l.e(message2, "message");
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        l.e(uri, "uri");
        throw new Error("An operation is not implemented: Not yet implemented");
    }
}
