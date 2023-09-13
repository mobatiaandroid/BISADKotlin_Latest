package com.mobatia.bisad.fragment.time_table.model.apimodel

import com.google.gson.annotations.SerializedName

class RangeApiModel (


    @SerializedName("Monday") val MondayList: List<TimeTableApiListModel>,
    @SerializedName("Tuesday") val TuesdayList: List<TimeTableApiListModel>,
    @SerializedName("Wednesday") val WednesdayList: List<TimeTableApiListModel>,
    @SerializedName("Thursday") val Thursday1List: List<TimeTableApiListModel>,
    @SerializedName("Friday") val Friday1List: List<TimeTableApiListModel>

)