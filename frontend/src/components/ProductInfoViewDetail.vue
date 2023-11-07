<template>

    <v-card outlined>
        <v-card-title>
            ProductInfo # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'ProductInfoViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/productInfos/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

