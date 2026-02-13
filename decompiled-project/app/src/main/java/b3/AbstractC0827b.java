package b3;

import android.content.ContentValues;
import android.database.Cursor;
import android.media.tv.TvContentRating;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: b3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0827b extends AbstractC0828c {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f13815c = (String[]) AbstractC0829d.a(AbstractC0828c.f13816b, new String[]{"internal_provider_id", "preview_video_uri", "last_playback_position_millis", "duration_millis", "intent_uri", "transient", "type", "poster_art_aspect_ratio", "poster_thumbnail_aspect_ratio", "logo_uri", "availability", "starting_price", "offer_price", "release_date", "item_count", "live", "interaction_type", "interaction_count", "author", "browsable", "content_id", "logo_content_description", "genre", "start_time_utc_millis", "end_time_utc_millis", "preview_audio_uri", "tv_series_item_type"});

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57, types: [int] */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v74 */
    /* JADX WARN: Type inference failed for: r3v75, types: [int] */
    /* JADX WARN: Type inference failed for: r3v77 */
    public static void b(Cursor cursor, AbstractC0826a abstractC0826a) {
        boolean z8;
        String str;
        String[] strArr;
        String sb2;
        String str2;
        int columnIndex = cursor.getColumnIndex("_id");
        if (columnIndex >= 0 && !cursor.isNull(columnIndex)) {
            ((ContentValues) abstractC0826a.f3094a).put("_id", Long.valueOf(cursor.getLong(columnIndex)));
        }
        int columnIndex2 = cursor.getColumnIndex("package_name");
        if (columnIndex2 >= 0 && !cursor.isNull(columnIndex2)) {
            ((ContentValues) abstractC0826a.f3094a).put("package_name", cursor.getString(columnIndex2));
        }
        int columnIndex3 = cursor.getColumnIndex("title");
        if (columnIndex3 >= 0 && !cursor.isNull(columnIndex3)) {
            ((ContentValues) abstractC0826a.f3094a).put("title", cursor.getString(columnIndex3));
        }
        int columnIndex4 = cursor.getColumnIndex("episode_title");
        if (columnIndex4 >= 0 && !cursor.isNull(columnIndex4)) {
            ((ContentValues) abstractC0826a.f3094a).put("episode_title", cursor.getString(columnIndex4));
        }
        int columnIndex5 = cursor.getColumnIndex("season_display_number");
        if (columnIndex5 >= 0 && !cursor.isNull(columnIndex5)) {
            ((ContentValues) abstractC0826a.f3094a).put("season_display_number", cursor.getString(columnIndex5));
        }
        int columnIndex6 = cursor.getColumnIndex("episode_display_number");
        if (columnIndex6 >= 0 && !cursor.isNull(columnIndex6)) {
            ((ContentValues) abstractC0826a.f3094a).put("episode_display_number", cursor.getString(columnIndex6));
        }
        int columnIndex7 = cursor.getColumnIndex("short_description");
        if (columnIndex7 >= 0 && !cursor.isNull(columnIndex7)) {
            ((ContentValues) abstractC0826a.f3094a).put("short_description", cursor.getString(columnIndex7));
        }
        int columnIndex8 = cursor.getColumnIndex("long_description");
        if (columnIndex8 >= 0 && !cursor.isNull(columnIndex8)) {
            ((ContentValues) abstractC0826a.f3094a).put("long_description", cursor.getString(columnIndex8));
        }
        int columnIndex9 = cursor.getColumnIndex("poster_art_uri");
        if (columnIndex9 >= 0 && !cursor.isNull(columnIndex9)) {
            abstractC0826a.E(Uri.parse(cursor.getString(columnIndex9)));
        }
        int columnIndex10 = cursor.getColumnIndex("thumbnail_uri");
        if (columnIndex10 >= 0 && !cursor.isNull(columnIndex10)) {
            abstractC0826a.G(Uri.parse(cursor.getString(columnIndex10)));
        }
        int columnIndex11 = cursor.getColumnIndex("audio_language");
        if (columnIndex11 >= 0 && !cursor.isNull(columnIndex11)) {
            String string = cursor.getString(columnIndex11);
            String[] split = TextUtils.isEmpty(string) ? null : string.split("\\s*,\\s*");
            ContentValues contentValues = (ContentValues) abstractC0826a.f3094a;
            if (split == null || split.length == 0) {
                str2 = null;
            } else {
                StringBuilder sb3 = new StringBuilder(split[0]);
                for (int i7 = 1; i7 < split.length; i7++) {
                    sb3.append(",");
                    sb3.append(split[i7]);
                }
                str2 = sb3.toString();
            }
            contentValues.put("audio_language", str2);
        }
        int columnIndex12 = cursor.getColumnIndex("canonical_genre");
        if (columnIndex12 >= 0 && !cursor.isNull(columnIndex12)) {
            String string2 = cursor.getString(columnIndex12);
            String[] strArr2 = j.f13828a;
            char c10 = '\"';
            if (TextUtils.isEmpty(string2)) {
                strArr = j.f13828a;
            } else if (string2.indexOf(44) == -1 && string2.indexOf(34) == -1) {
                strArr = new String[]{string2.trim()};
            } else {
                StringBuilder sb4 = new StringBuilder();
                ArrayList arrayList = new ArrayList();
                int length = string2.length();
                boolean z10 = false;
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = string2.charAt(i10);
                    if (charAt != '\"') {
                        if (charAt == ',' && !z10) {
                            String trim = sb4.toString().trim();
                            if (trim.length() > 0) {
                                arrayList.add(trim);
                            }
                            sb4 = new StringBuilder();
                        }
                        sb4.append(charAt);
                        z10 = false;
                    } else {
                        if (!z10) {
                            z10 = true;
                        }
                        sb4.append(charAt);
                        z10 = false;
                    }
                }
                String trim2 = sb4.toString().trim();
                if (trim2.length() > 0) {
                    arrayList.add(trim2);
                }
                strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
            ContentValues contentValues2 = (ContentValues) abstractC0826a.f3094a;
            String[] strArr3 = j.f13828a;
            if (strArr == null) {
                sb2 = null;
            } else {
                StringBuilder sb5 = new StringBuilder();
                int length2 = strArr.length;
                String str3 = "";
                int i11 = 0;
                while (i11 < length2) {
                    String str4 = strArr[i11];
                    sb5.append(str3);
                    StringBuilder sb6 = new StringBuilder();
                    int length3 = str4.length();
                    for (int i12 = 0; i12 < length3; i12++) {
                        char charAt2 = str4.charAt(i12);
                        if (charAt2 == c10) {
                            sb6.append(c10);
                        } else if (charAt2 != ',') {
                            c10 = '\"';
                        } else {
                            c10 = '\"';
                            sb6.append('\"');
                        }
                        sb6.append(charAt2);
                    }
                    sb5.append(sb6.toString());
                    i11++;
                    str3 = ",";
                }
                sb2 = sb5.toString();
            }
            contentValues2.put("canonical_genre", sb2);
        }
        int columnIndex13 = cursor.getColumnIndex("content_rating");
        if (columnIndex13 < 0 || cursor.isNull(columnIndex13)) {
            z8 = false;
        } else {
            String string3 = cursor.getString(columnIndex13);
            boolean isEmpty = TextUtils.isEmpty(string3);
            TvContentRating[] tvContentRatingArr = AbstractC0829d.f13819b;
            if (!isEmpty) {
                String[] split2 = string3.split("\\s*,\\s*", -1);
                ArrayList arrayList2 = new ArrayList(split2.length);
                for (String str5 : split2) {
                    try {
                        arrayList2.add(TvContentRating.unflattenFromString(str5));
                    } catch (IllegalArgumentException e2) {
                        Log.w("TvContractUtils", "Can't parse the content rating: '" + str5 + "', skipping", e2);
                    }
                }
                if (arrayList2.size() != 0) {
                    tvContentRatingArr = (TvContentRating[]) arrayList2.toArray(new TvContentRating[arrayList2.size()]);
                }
            }
            ContentValues contentValues3 = (ContentValues) abstractC0826a.f3094a;
            if (tvContentRatingArr == null || tvContentRatingArr.length == 0) {
                z8 = false;
                str = null;
            } else {
                z8 = false;
                StringBuilder sb7 = new StringBuilder(tvContentRatingArr[0].flattenToString());
                for (int i13 = 1; i13 < tvContentRatingArr.length; i13++) {
                    sb7.append(",");
                    sb7.append(tvContentRatingArr[i13].flattenToString());
                }
                str = sb7.toString();
            }
            contentValues3.put("content_rating", str);
        }
        int columnIndex14 = cursor.getColumnIndex("video_width");
        if (columnIndex14 >= 0 && !cursor.isNull(columnIndex14)) {
            ((ContentValues) abstractC0826a.f3094a).put("video_width", Integer.valueOf((int) cursor.getLong(columnIndex14)));
        }
        int columnIndex15 = cursor.getColumnIndex("video_height");
        if (columnIndex15 >= 0 && !cursor.isNull(columnIndex15)) {
            ((ContentValues) abstractC0826a.f3094a).put("video_height", Integer.valueOf((int) cursor.getLong(columnIndex15)));
        }
        int columnIndex16 = cursor.getColumnIndex("internal_provider_data");
        if (columnIndex16 >= 0 && !cursor.isNull(columnIndex16)) {
            ((ContentValues) abstractC0826a.f3094a).put("internal_provider_data", cursor.getBlob(columnIndex16));
        }
        int i14 = Build.VERSION.SDK_INT;
        int columnIndex17 = cursor.getColumnIndex("searchable");
        if (columnIndex17 >= 0 && !cursor.isNull(columnIndex17)) {
            abstractC0826a.F(cursor.getInt(columnIndex17) == 1 ? true : z8);
        }
        int columnIndex18 = cursor.getColumnIndex("internal_provider_flag1");
        if (columnIndex18 >= 0 && !cursor.isNull(columnIndex18)) {
            ((ContentValues) abstractC0826a.f3094a).put("internal_provider_flag1", Long.valueOf(cursor.getLong(columnIndex18)));
        }
        int columnIndex19 = cursor.getColumnIndex("internal_provider_flag2");
        if (columnIndex19 >= 0 && !cursor.isNull(columnIndex19)) {
            ((ContentValues) abstractC0826a.f3094a).put("internal_provider_flag2", Long.valueOf(cursor.getLong(columnIndex19)));
        }
        int columnIndex20 = cursor.getColumnIndex("internal_provider_flag3");
        if (columnIndex20 >= 0 && !cursor.isNull(columnIndex20)) {
            ((ContentValues) abstractC0826a.f3094a).put("internal_provider_flag3", Long.valueOf(cursor.getLong(columnIndex20)));
        }
        int columnIndex21 = cursor.getColumnIndex("internal_provider_flag4");
        if (columnIndex21 >= 0 && !cursor.isNull(columnIndex21)) {
            ((ContentValues) abstractC0826a.f3094a).put("internal_provider_flag4", Long.valueOf(cursor.getLong(columnIndex21)));
        }
        int columnIndex22 = cursor.getColumnIndex("season_title");
        if (columnIndex22 >= 0 && !cursor.isNull(columnIndex22)) {
            ((ContentValues) abstractC0826a.f3094a).put("season_title", cursor.getString(columnIndex22));
        }
        if (i14 >= 26) {
            int columnIndex23 = cursor.getColumnIndex("review_rating_style");
            if (columnIndex23 >= 0 && !cursor.isNull(columnIndex23)) {
                ((ContentValues) abstractC0826a.f3094a).put("review_rating_style", Integer.valueOf(cursor.getInt(columnIndex23)));
            }
            int columnIndex24 = cursor.getColumnIndex("review_rating");
            if (columnIndex24 >= 0 && !cursor.isNull(columnIndex24)) {
                ((ContentValues) abstractC0826a.f3094a).put("review_rating", cursor.getString(columnIndex24));
            }
        }
        int columnIndex25 = cursor.getColumnIndex("series_id");
        if (columnIndex25 >= 0 && !cursor.isNull(columnIndex25)) {
            ((ContentValues) abstractC0826a.f3094a).put("series_id", cursor.getString(columnIndex25));
        }
        if (i14 >= 26) {
            int columnIndex26 = cursor.getColumnIndex("internal_provider_id");
            if (columnIndex26 >= 0 && !cursor.isNull(columnIndex26)) {
                ((ContentValues) abstractC0826a.f3094a).put("internal_provider_id", cursor.getString(columnIndex26));
            }
            int columnIndex27 = cursor.getColumnIndex("preview_video_uri");
            if (columnIndex27 >= 0 && !cursor.isNull(columnIndex27)) {
                Uri parse = Uri.parse(cursor.getString(columnIndex27));
                ((ContentValues) abstractC0826a.f3094a).put("preview_video_uri", parse == null ? null : parse.toString());
            }
            int columnIndex28 = cursor.getColumnIndex("last_playback_position_millis");
            if (columnIndex28 >= 0 && !cursor.isNull(columnIndex28)) {
                ((ContentValues) abstractC0826a.f3094a).put("last_playback_position_millis", Integer.valueOf(cursor.getInt(columnIndex28)));
            }
            int columnIndex29 = cursor.getColumnIndex("duration_millis");
            if (columnIndex29 >= 0 && !cursor.isNull(columnIndex29)) {
                ((ContentValues) abstractC0826a.f3094a).put("duration_millis", Integer.valueOf(cursor.getInt(columnIndex29)));
            }
            int columnIndex30 = cursor.getColumnIndex("intent_uri");
            if (columnIndex30 >= 0 && !cursor.isNull(columnIndex30)) {
                abstractC0826a.L(Uri.parse(cursor.getString(columnIndex30)));
            }
            int columnIndex31 = cursor.getColumnIndex("transient");
            if (columnIndex31 >= 0 && !cursor.isNull(columnIndex31)) {
                ((ContentValues) abstractC0826a.f3094a).put("transient", Integer.valueOf((int) (cursor.getInt(columnIndex31) == 1 ? 1 : z8)));
            }
            int columnIndex32 = cursor.getColumnIndex("type");
            if (columnIndex32 >= 0 && !cursor.isNull(columnIndex32)) {
                abstractC0826a.O(cursor.getInt(columnIndex32));
            }
            int columnIndex33 = cursor.getColumnIndex("poster_art_aspect_ratio");
            if (columnIndex33 >= 0 && !cursor.isNull(columnIndex33)) {
                ((ContentValues) abstractC0826a.f3094a).put("poster_art_aspect_ratio", Integer.valueOf(cursor.getInt(columnIndex33)));
            }
            int columnIndex34 = cursor.getColumnIndex("poster_thumbnail_aspect_ratio");
            if (columnIndex34 >= 0 && !cursor.isNull(columnIndex34)) {
                ((ContentValues) abstractC0826a.f3094a).put("poster_thumbnail_aspect_ratio", Integer.valueOf(cursor.getInt(columnIndex34)));
            }
            int columnIndex35 = cursor.getColumnIndex("logo_uri");
            if (columnIndex35 >= 0 && !cursor.isNull(columnIndex35)) {
                abstractC0826a.M(Uri.parse(cursor.getString(columnIndex35)));
            }
            int columnIndex36 = cursor.getColumnIndex("availability");
            if (columnIndex36 >= 0 && !cursor.isNull(columnIndex36)) {
                ((ContentValues) abstractC0826a.f3094a).put("availability", Integer.valueOf(cursor.getInt(columnIndex36)));
            }
            int columnIndex37 = cursor.getColumnIndex("starting_price");
            if (columnIndex37 >= 0 && !cursor.isNull(columnIndex37)) {
                ((ContentValues) abstractC0826a.f3094a).put("starting_price", cursor.getString(columnIndex37));
            }
            int columnIndex38 = cursor.getColumnIndex("offer_price");
            if (columnIndex38 >= 0 && !cursor.isNull(columnIndex38)) {
                ((ContentValues) abstractC0826a.f3094a).put("offer_price", cursor.getString(columnIndex38));
            }
            int columnIndex39 = cursor.getColumnIndex("release_date");
            if (columnIndex39 >= 0 && !cursor.isNull(columnIndex39)) {
                ((ContentValues) abstractC0826a.f3094a).put("release_date", cursor.getString(columnIndex39));
            }
            int columnIndex40 = cursor.getColumnIndex("item_count");
            if (columnIndex40 >= 0 && !cursor.isNull(columnIndex40)) {
                ((ContentValues) abstractC0826a.f3094a).put("item_count", Integer.valueOf(cursor.getInt(columnIndex40)));
            }
            int columnIndex41 = cursor.getColumnIndex("live");
            if (columnIndex41 >= 0 && !cursor.isNull(columnIndex41)) {
                ((ContentValues) abstractC0826a.f3094a).put("live", Integer.valueOf((int) (cursor.getInt(columnIndex41) == 1 ? 1 : z8)));
            }
            int columnIndex42 = cursor.getColumnIndex("interaction_type");
            if (columnIndex42 >= 0 && !cursor.isNull(columnIndex42)) {
                ((ContentValues) abstractC0826a.f3094a).put("interaction_type", Integer.valueOf(cursor.getInt(columnIndex42)));
            }
            int columnIndex43 = cursor.getColumnIndex("interaction_count");
            if (columnIndex43 >= 0 && !cursor.isNull(columnIndex43)) {
                ((ContentValues) abstractC0826a.f3094a).put("interaction_count", Long.valueOf(cursor.getInt(columnIndex43)));
            }
            int columnIndex44 = cursor.getColumnIndex("author");
            if (columnIndex44 >= 0 && !cursor.isNull(columnIndex44)) {
                ((ContentValues) abstractC0826a.f3094a).put("author", cursor.getString(columnIndex44));
            }
            int columnIndex45 = cursor.getColumnIndex("browsable");
            if (columnIndex45 >= 0 && !cursor.isNull(columnIndex45)) {
                abstractC0826a.K(cursor.getInt(columnIndex45) != 1 ? z8 : true);
            }
            int columnIndex46 = cursor.getColumnIndex("content_id");
            if (columnIndex46 >= 0 && !cursor.isNull(columnIndex46)) {
                ((ContentValues) abstractC0826a.f3094a).put("content_id", cursor.getString(columnIndex46));
            }
            int columnIndex47 = cursor.getColumnIndex("logo_content_description");
            if (columnIndex47 >= 0 && !cursor.isNull(columnIndex47)) {
                ((ContentValues) abstractC0826a.f3094a).put("logo_content_description", cursor.getString(columnIndex47));
            }
            int columnIndex48 = cursor.getColumnIndex("genre");
            if (columnIndex48 >= 0 && !cursor.isNull(columnIndex48)) {
                ((ContentValues) abstractC0826a.f3094a).put("genre", cursor.getString(columnIndex48));
            }
            int columnIndex49 = cursor.getColumnIndex("start_time_utc_millis");
            if (columnIndex49 >= 0 && !cursor.isNull(columnIndex49)) {
                ((ContentValues) abstractC0826a.f3094a).put("start_time_utc_millis", Long.valueOf(cursor.getLong(columnIndex49)));
            }
            int columnIndex50 = cursor.getColumnIndex("end_time_utc_millis");
            if (columnIndex50 >= 0 && !cursor.isNull(columnIndex50)) {
                ((ContentValues) abstractC0826a.f3094a).put("end_time_utc_millis", Long.valueOf(cursor.getLong(columnIndex50)));
            }
            int columnIndex51 = cursor.getColumnIndex("preview_audio_uri");
            if (columnIndex51 >= 0 && !cursor.isNull(columnIndex51)) {
                Uri parse2 = Uri.parse(cursor.getString(columnIndex51));
                ((ContentValues) abstractC0826a.f3094a).put("preview_audio_uri", parse2 == null ? null : parse2.toString());
            }
            int columnIndex52 = cursor.getColumnIndex("tv_series_item_type");
            if (columnIndex52 < 0 || cursor.isNull(columnIndex52)) {
                return;
            }
            ((ContentValues) abstractC0826a.f3094a).put("tv_series_item_type", Integer.valueOf(cursor.getInt(columnIndex52)));
        }
    }

    public ContentValues c() {
        ContentValues contentValues = new ContentValues(this.f13817a);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 26) {
            contentValues.remove("review_rating_style");
            contentValues.remove("review_rating");
        }
        if (i7 < 26) {
            contentValues.remove("internal_provider_id");
            contentValues.remove("preview_video_uri");
            contentValues.remove("last_playback_position_millis");
            contentValues.remove("duration_millis");
            contentValues.remove("intent_uri");
            contentValues.remove("transient");
            contentValues.remove("type");
            contentValues.remove("poster_art_aspect_ratio");
            contentValues.remove("poster_thumbnail_aspect_ratio");
            contentValues.remove("logo_uri");
            contentValues.remove("availability");
            contentValues.remove("starting_price");
            contentValues.remove("offer_price");
            contentValues.remove("release_date");
            contentValues.remove("item_count");
            contentValues.remove("live");
            contentValues.remove("interaction_count");
            contentValues.remove("author");
            contentValues.remove("content_id");
            contentValues.remove("logo_content_description");
            contentValues.remove("genre");
            contentValues.remove("start_time_utc_millis");
            contentValues.remove("end_time_utc_millis");
            contentValues.remove("preview_audio_uri");
            contentValues.remove("tv_series_item_type");
        }
        contentValues.remove("browsable");
        return contentValues;
    }
}
